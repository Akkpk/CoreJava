package OOPs.Polymorphism;
class Animal{
    public void speak(){
        System.out.println("Speaking");
    }
}

class Dog extends Animal{
    @Override
    public void speak() {
        System.out.println("Barking...!");
    }
}
public class OverridingDemos {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.speak();
    }
}
