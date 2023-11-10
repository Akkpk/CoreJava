package MultiThreading.ThreadMethods.PreventThreadExecutionMethods.C_JoinMethod;

class findSumEven extends Thread{
    long st=0;
    long end=1900000000;
    long evenSum=0;

    @Override
    public void run() {
        findEven(st, end);
    }

    public void findEven(long st, long end) {
        for (long i = st; i < end ; i++) {
            if((i&1)==0){
                evenSum+=i;
            }
        }
        System.out.println("even Sum: "+evenSum);
    }
}

class findSumOdd extends Thread{
    long st=0;
    long end=1900000000;
    long oddSum=0;

    @Override
    public void run() {
        findOdd(st, end);
    }

    public void findOdd(long st, long end) {
        for (long i = st; i < end ; i++) {
            if((i&1)!=0){
                oddSum+=i;
            }
        }
        System.out.println("Odd Sum: "+oddSum);
    }
}

public class demo3 extends Thread{

    public static void main(String[] args) throws InterruptedException{
        findSumOdd t1 = new findSumOdd();
        findSumEven t2 = new findSumEven();

        long start = System.currentTimeMillis();

        //without thread     duration: 4s
//        t1.findOdd(0,1900000000);
//        t2.findEven(0,1900000000);


        //with thread duration: 2s
        t1.start();
        t2.start();

        t1.join();
        t2.join();


        long end = System.currentTimeMillis();
        long duration = end-start;
        System.out.println("Duration: "+duration);

    }
}
