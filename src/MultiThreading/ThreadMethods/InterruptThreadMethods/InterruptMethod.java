package MultiThreading.ThreadMethods.InterruptThreadMethods;

public class InterruptMethod extends Thread{
    @Override
    public void run() {
        try{
            for (int i = 1; i <= 5 ; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        InterruptMethod t = new InterruptMethod();
        t.start();
        t.interrupt();
    }
}
