package MultiThreading.ThreadSynchronization.MutualExclusive;
//it accessed Class Level logs

/*  Why?
    When we use Synchronised Block/Method, they use the object level logs. But when we create more than one objects then data inconsistency problem occur. That is why we use Static Synchronization.
*/

class BookingSeats{

    //    int totalSeats = 20;// for every object seats will be 20
//    synchronized public void bookSeats(int seats){

    static int totalSeats = 20;// here only 20 seats is available for each object
    static synchronized public void bookSeats(int seats){// here this method will not run one by one for every object ant work according input which is static
        if(totalSeats>=seats){
            System.out.println(seats+" Seat Booked.");
            totalSeats= totalSeats-seats;
            System.out.println("Seats left: "+totalSeats);
        }else{
            System.out.println("Sorry seats cannot be booked....!");
            System.out.println("Seats left: "+totalSeats);
        }
    }
}

class MyThread1 extends Thread{
    BookingSeats b;
    int seats;

    MyThread1(BookingSeats b, int seats){
        this.b=b;
        this.seats=seats;
    }

    @Override
    public void run() {
        b.bookSeats(seats);
    }
}

class MyThread2 extends Thread{
    BookingSeats b;
    int seats;

    MyThread2(BookingSeats b, int seats){
        this.b=b;
        this.seats=seats;
    }

    @Override
    public void run() {
        b.bookSeats(seats);
    }
}

public class StaticSynchronizationDemo {
    public static void main(String[] args) {
        BookingSeats b1 = new BookingSeats();
        MyThread1 t1 = new MyThread1(b1,7);
        t1.start();
        MyThread2 t2 = new MyThread2(b1,6);
        t2.start();

        BookingSeats b2 = new BookingSeats();
        MyThread1 t3 = new MyThread1(b2, 5);
        t3.start();
        MyThread2 t4 = new MyThread2(b2,6);
        t4.start();

    }
}
