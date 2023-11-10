package MultiThreading.ThreadLifeCycle;

class Test extends Thread{
    @Override
    public void run() {
        System.out.println("I ma run");
    }
}

public class ThreadLifeCycle {
    public static void main(String[] args) {
        Test t = new Test();// (1) Create
        t.start();//(2)Runnable
    }
}

/*
(3)Non- Runnable: When we suspend, when we call sleep() or when thread is waiting for processor
(4)Running : when JVM allocate processor to the thread
(5)Dead: When the task of the thread completes
 */
