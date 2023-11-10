package OOPs.ObjectsDemos;

class Animal{
    public void eat(){
        System.out.println("Eating.");
    }
}

public class ObjectsCreation {
    public static void main(String[] args) {
        //Creating Objects

        //Declaration
        Animal buz;//here Animal is class name and buz is referenceVariableName. buz is currently pointing to null.

        //Instantiate and Initialization
        buz=new Animal();//now buz will point to the memory location where the Animal object is allocated

        buz.eat();
    }
}
