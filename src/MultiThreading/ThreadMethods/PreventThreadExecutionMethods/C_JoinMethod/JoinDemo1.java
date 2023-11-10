package MultiThreading.ThreadMethods.PreventThreadExecutionMethods.C_JoinMethod;

class Medical extends Thread{
    @Override
    public void run() {
        System.out.println("Medical Start.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Medical Done.");
    }
}

class TestDrive extends Thread {
    @Override
    public void run() {
        System.out.println("TestDrive Start.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("TestDrive Done.");
    }
}

class OfficerSignature extends Thread {
    @Override
    public void run() {
        System.out.println("Officer Checking Documents.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Officer Signature Done.");
    }
}

public class JoinDemo1 {
    public static void main(String[] args) throws InterruptedException {//main
        Medical m = new Medical();
        m.start();//Thread-0

        m.join();//Medical will finish their task then main will continue

        TestDrive td = new TestDrive();
        td.start();//Thread-1

        td.join();//TestDrive will finish their task then main will continue

        OfficerSignature os = new OfficerSignature();
        os.start();//Thread-2

        os.join();//OfficerSignature will finish their task then main will continue

        System.out.println("License Created");
    }
}
