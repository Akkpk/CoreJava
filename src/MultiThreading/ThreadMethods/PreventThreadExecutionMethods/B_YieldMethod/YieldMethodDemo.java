package MultiThreading.ThreadMethods.PreventThreadExecutionMethods.B_YieldMethod;

public class YieldMethodDemo extends Thread {

    @Override
    public void run() {

        Thread.yield();

        for (int i = 1; i <= 5; i++) {
            System.out.println(i+ " : "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        YieldMethodDemo t = new YieldMethodDemo();
        t.start();

//        Thread.yield();

        for (int i = 1; i <= 5; i++) {
            System.out.println(i+ " : "+Thread.currentThread().getName());
        }
    }
}
