package OOPs.Inheritance;

class Animal{
    public void eat(){
        System.out.println("Eating");
    }
}

public class Demo extends Animal{
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.eat();
    }

}
