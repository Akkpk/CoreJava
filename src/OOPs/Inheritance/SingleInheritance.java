package OOPs.Inheritance;

class A{
    public void m1(){
        System.out.println("I am m1 of A.");
    }
}

class B extends A{
    public void m2(){
        System.out.println("I am m2 of B.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.m2();
        obj.m1();
    }
}
