package MultiThreading.CreatingThreads;


class CreatingThreadM1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20 ; i++) {
            System.out.println("I am run "+ currentThread().getName());
        }
    }
    public static void main(String[] args) {
        CreatingThreadM1 t = new CreatingThreadM1();
        t.start();
        t.setName("t1");

        CreatingThreadM1 t2 = new CreatingThreadM1();
        t2.start();
        t2.setName("t2");
    }
}


