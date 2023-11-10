package MultiThreading.ThreadSynchronization.MutualExclusive;

class BookingSeatTicket{
    int Total_Seats = 10;
    public void bookSeats(int seats){

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());

        //synchronized block
        //'this' can be used as object reference
        synchronized (this){
            if(Total_Seats>=seats){
                System.out.println(seats+" Seat Booked.");
                Total_Seats= Total_Seats-seats;
                System.out.println("Seats left: "+Total_Seats);
            }else{
                System.out.println("Sorry seats cannot be booked....!");
                System.out.println("Seats left: "+Total_Seats);
            }
        }

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
    }
}

public class SynchronizedBlockDemo extends Thread{
    static BookingSeatTicket b;
    int seats;
    @Override
    public void run() {
        b.bookSeats(seats);
    }

    public static void main(String[] args) {
        b = new BookingSeatTicket();
        SynchronizedBlockDemo Aditya = new SynchronizedBlockDemo();
        Aditya.seats=7;
        Aditya.start();

        SynchronizedBlockDemo Rakesh = new SynchronizedBlockDemo();
        Rakesh.seats=6;
        Rakesh.start();
    }
}
