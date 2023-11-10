package StaticKeyword;

public class Demo1 {

    int a;
    static int b;

    void m1(){
        System.out.println("I am non static method.......m1");
    }

    static void m2(){
        System.out.println("I am static method.......m2");
    }

    public static void main(String[] args) {
        //Static methods can access static stuff(directly)
        b = 100;
        System.out.println(b);
        m2();

        //a=10; //non-accessible, because it is non-static
        //m1(); //non-accessible, because it is non-static

        //Static method can access non-static stuff but through objects
        Demo1 obj = new Demo1();
        obj.a=100;
        System.out.println(obj.a);
        obj.m1();
    }
}
