package MultiThreading.ThreadMethods.DaemonThreadMethods;

public class Demo1 extends Thread {

    @Override
    public void run() {

        System.out.println("Is Daemon:"+Thread.currentThread().isDaemon());
//        System.out.println("Child Thread");

    }

    public static void main(String[] args) {
        //You cannot make main method as daemon thread.
//        Thread.currentThread().setDaemon(true);//Exception in thread "main" java.lang.IllegalThreadStateException
        System.out.println("Main Thread");
        System.out.println("Main is Daemon:"+ Thread.currentThread().isDaemon());
        Demo1 t = new Demo1();
        t.setDaemon(true);
        t.start();
//        t.setDaemon(true);//Exception in thread "main" java.lang.IllegalThreadStateException
    }
}
