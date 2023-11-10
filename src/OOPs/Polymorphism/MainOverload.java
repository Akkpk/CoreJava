package OOPs.Polymorphism;

public class MainOverload {
    public static void main(String[] args) {
        System.out.println("1");
        MainOverload obj = new MainOverload();
        obj.main(20);
    }

    public static void main(int a) {
        System.out.println(a);

    }
}
