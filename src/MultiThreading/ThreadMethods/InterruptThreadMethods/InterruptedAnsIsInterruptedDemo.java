package MultiThreading.ThreadMethods.InterruptThreadMethods;

public class InterruptedAnsIsInterruptedDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Is Thread Interrupted: "+Thread.interrupted());//This will print true and change the interrupted status to true to false means Thread is no longer interrupted
        System.out.println("Is Thread Interrupted: "+Thread.interrupted());
//        System.out.println("Is Thread Interrupted: "+Thread.currentThread().isInterrupted());//This will print true only if Thread is interrupted otherwise it will print false
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
//                System.out.println("Is Thread Interrupted: "+Thread.interrupted());
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        InterruptedAnsIsInterruptedDemo t = new InterruptedAnsIsInterruptedDemo();
        t.start();
        t.interrupt();
    }
}
