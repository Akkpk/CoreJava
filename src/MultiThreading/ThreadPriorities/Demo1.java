package MultiThreading.ThreadPriorities;

public class Demo1 extends Thread{
    @Override
    public void run() {
        System.out.println("Child Thread.");
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        Demo1 t = new Demo1();
        t.start();
    }
}
