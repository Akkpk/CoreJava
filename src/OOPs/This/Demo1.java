package OOPs.This;
//'this' keyword reference variable that refers to the current object
class A{
    String a;
    int b;

    public A(String x, int y) {
        this.a = a;
        this.b = b;

        System.out.println(x);
        System.out.println(y);
    }
}
public class Demo1 {
    public static void main(String[] args) {
        A a = new A("A",10);

    }
}
