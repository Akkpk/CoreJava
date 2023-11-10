package OOPs.Inheritance;

class Grandfather{
    public void m1(){
        System.out.println("GrandFather.");

    }
}

class Father extends Grandfather{
    public void m2(){
        System.out.println("Father.");
    }
}
class child extends Father{

    public void m3(){

        System.out.println("child.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        child obj = new child();

        obj.m1();
        obj.m2();
        obj.m3();
    }
}
