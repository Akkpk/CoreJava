package MultiThreading.ThreadMethods.PreventThreadExecutionMethods.C_JoinMethod;

public class JoinDemo extends Thread {
    @Override
    public void run() {
        try{
            for (int i = 0; i < 4 ; i++) {
                System.out.println("Child Thread : "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinDemo t= new JoinDemo();
        t.start();

//        t.join();//main Thread will wait to finish Thread-0 to finish their task
        t.join(10000);//main Thread will wait for 10s to finish Thread-0 to finish their task otherwise main will again execute
        try{
            for (int i = 0; i < 4 ; i++) {
                System.out.println("main Thread : "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
