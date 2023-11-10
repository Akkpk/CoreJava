package LambadExpressions;

@FunctionalInterface
interface Cab {
//    public void bookCab();
//    public void bookCab(String source, String des);//With Parameters
    public String bookCab(String source, String des);//With return statement
}

//At hte place of this class we can use a Lambda expression because Cab class is a functional interface

//class Ola implements Cab{
//    @Override
//    public void bookCab() {
//        System.out.println("Ola cab is Booked...");
//    }
//}

public class LambdaDemo {
    public static void main(String[] args) {
//        Cab cab = new Ola(); Here we can write a lambda expression

//        Cab cab = () -> System.out.println("Cab is Booked....);

        //With Parameters
//        Cab cab = (source, des) -> System.out.println("Cab is Booked from "+source+" to "+des);

        //With return statement
        Cab cab = (source, des) -> {
            System.out.println("Cab is Booked from "+source+" to "+des);
            return "Price is: 5000";
        };
        System.out.println(cab.bookCab("Mumbai", "Delhi"));

//        Runnable r = () -> {
//            System.out.println("I am thread.");
//        };
//
//        Thread th = new Thread(r);
//        th.start();
    }

}
