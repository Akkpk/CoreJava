package OOPs.Super;

//'super' keyword is a reference variable which is used to refer the immediate parent class


class A{
    int a = 10;
}

class B extends A{
    int a = 20;
    public void m1(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}

public class Demo1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.m1(30);
    }
}
