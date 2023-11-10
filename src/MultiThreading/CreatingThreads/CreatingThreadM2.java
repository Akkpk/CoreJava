package MultiThreading.CreatingThreads;

//public class CreatingThreadM2 implements Runnable{
//    @Override
//    public void run() {
//        System.out.println("I am Run");
//    }
//
//    public static void main(String[] args) {
//        CreatingThreadM2 c = new CreatingThreadM2();
//        Thread th = new Thread(c);
//        th.start();
//    }
//}

//By Lambda Function


public class CreatingThreadM2 {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("I am Run method implemented using Anonymous class/Lambda Function.");
        Thread th = new Thread(r);
        th.start();
    }
}
