package OOPs.Polymorphism;
class Calculation{
    public void add(int a, int b){
        System.out.println(a+b);
    }

    public void add(int a, int b,int c){
        System.out.println(a+b+c);
    }
}

public class OverloadingDemos {
    public static void main(String[] args) {
        Calculation obj = new Calculation();

        obj.add(5,7);
        obj.add(5,7,8);
    }
}
