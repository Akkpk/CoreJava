package OOPs.Inheritance;

class Animals{
    public void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animals{
    public void bark(){
        System.out.println("barking...");
    }
}

class Cat extends Animals{
    public void meow(){
        System.out.println("Meow...");
    }
}

public class HieraricalInheritance {
    public static void main(String[] args) {
        Dog d= new Dog();
        Cat c = new Cat();

        c.eat();
        d.eat();
    }
}
