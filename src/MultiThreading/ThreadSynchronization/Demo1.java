package MultiThreading.ThreadSynchronization;

class BookSeatTickets{
    int Total_Seats = 10;
    public void bookSeats(int seats){
        if(Total_Seats>=seats){
            System.out.println("Seat Booked.");
            Total_Seats= Total_Seats-seats;
            System.out.println("Seats left: "+Total_Seats);
        }else{
            System.out.println("No seat left.");
        }
    }
}

public class Demo1  extends Thread{

    static BookSeatTickets b;
    int seats;
    @Override
    public void run() {
        b.bookSeats(seats);
    }

    public static void main(String[] args) {
        b = new BookSeatTickets();
        Demo1 user1 = new Demo1();
        user1.seats=7;
        user1.start();

        Demo1 user2 = new Demo1();
        user2.seats=6;
        user2.start();

//        here we are creating two users which books tickets but as we created thread which books ticket.
//        then what will happen is when we start the thread both the threads will run simultaneously and give negative seats in result
    }
}
