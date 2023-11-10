package OOPs.StaticBlock;

public class Demo2 {
    static {
        System.out.println("Main upar wala");
    }
    public static void main(String[] args) {
        System.out.println("I am main");
    }

    static {
        System.out.println("mai niche wala");
    }
}
