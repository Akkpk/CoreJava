package MultiThreading.ThreadSynchronization.MutualExclusive;

class BookSeatTicket{
    int Total_Seats = 10;
    synchronized public void bookSeats(int seats){
        if(Total_Seats>=seats){
            System.out.println(seats+" Seat Booked.");
            Total_Seats= Total_Seats-seats;
            System.out.println("Seats left: "+Total_Seats);
        }else{
            System.out.println("Sorry seats cannot be booked....!");
            System.out.println("Seats left: "+Total_Seats);
        }
    }
}

public class SynchronizedMethod extends Thread{
    static BookSeatTicket b;
    int seats;
    @Override
    public void run() {
        b.bookSeats(seats);
    }

    public static void main(String[] args) {
        b = new BookSeatTicket();
        SynchronizedMethod Aditya = new SynchronizedMethod();
        Aditya.seats=7;
        Aditya.start();

        SynchronizedMethod Rakesh = new SynchronizedMethod();
        Rakesh.seats=6;
        Rakesh.start();
    }
}
