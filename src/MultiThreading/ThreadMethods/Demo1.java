package MultiThreading.ThreadMethods;
//getName()  setName()  currentThread()  isAlive()

public class Demo1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread name is:"+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Demo1 t = new Demo1();
        Demo1 t2 = new Demo1();

        System.out.println("Thread name is: "+Thread.currentThread().getName());//main
        Thread.currentThread().setName("Aditya");//setting name of thread
        System.out.println("Thread is alive: "+Thread.currentThread().isAlive());//checking whether a thread is alive or not

        //Setting other threads name
        t.setName("Aditya1");
        t2.setName("Aditya2");

        t.start();
        t2.start();


//        System.err.println(10/0);

    }
}
