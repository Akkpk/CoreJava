package MultiThreading.ThreadMethods.PreventThreadExecutionMethods.A_SleepMethod;

public class SleepVsRunMethod extends Thread{
    @Override
    public void run() {
        try{
            for (int i = 1; i <=5 ; i++) {
                System.out.println(i + " : " +Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        SleepVsRunMethod t1 = new SleepVsRunMethod();
        SleepVsRunMethod t2 = new SleepVsRunMethod();

//        t1.start();
//        t2.start();
        /* Output:
        1 : Thread-0
        1 : Thread-1
        2 : Thread-1
        2 : Thread-0
        3 : Thread-0
        3 : Thread-1
        4 : Thread-0
        4 : Thread-1
        5 : Thread-0
        5 : Thread-1
         */

        t1.run();
        t2.run();

        /*
        Output
        1 : main
        2 : main
        3 : main
        4 : main
        5 : main
        1 : main
        2 : main
        3 : main
        4 : main
        5 : main
         */
    }
}
