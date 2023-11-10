package MultiThreading.ThreadMethods.PreventThreadExecutionMethods.A_SleepMethod;

/*
class Thread{
    public static native void sleep(long val);//Throws InterruptedException
    public static void sleep(long val, int nano); //Throws InterruptedException
}
 */
public class SleepMethodDemo extends Thread {
    @Override
    public void run() {
        //Executed by Thread-0
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
            try {
                //Thread.sleep(1000);//Thread-0 Thread will sleep
                Thread.sleep(1000, 50);//Thread-0 Thread will sleep for 1.5s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)  {
        ////Executed by main
//        for (int i = 1; i <= 5; i++){
//            System.out.println(i);
//            Thread.sleep(1000);//main Thread will sleep
//        }
        SleepMethodDemo t = new SleepMethodDemo();
        t.start();

    }
}
