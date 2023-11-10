package OOPs.Constructors;

public class Demo1 {
    String a;
    int id;

    Demo1(String a, int i){
        this.a=a;
        this.id=i;
    }

    public static void main(String[] args) {
//        Demo1 obj1 = new Demo1();
        Demo1 obj2 = new Demo1("Aditya",10);
        System.out.println(obj2.a +" "+obj2.id);
    }
}
