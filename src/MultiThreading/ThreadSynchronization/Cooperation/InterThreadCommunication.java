package MultiThreading.ThreadSynchronization.Cooperation;

class TotalEarnings extends Thread{
    int total = 0;

    @Override
    public void run() {
        synchronized (this){
            for (int i = 1; i <=10 ; i++) {
                total+=100;
            }
            this.notify();
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) throws InterruptedException{
        TotalEarnings te = new TotalEarnings();
        te.start();
//        System.out.printf("Total earnings: %drs",te.total);

        synchronized (te){
            te.wait();
        }
        System.out.printf("Total earnings: %d rs",te.total);
    }
}
