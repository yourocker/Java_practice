import java.util.Random;
public class SomeClass {
    private static final int MAX_SIZE = 10;

    public int a;
    public static int b = 10;

    static {
        Random random = new Random();
        b = random.nextInt(100);
    }

    public void method() {
        System.out.println("a = " + a);
        System.out.println("static b = " + b);
    }

    public static void staticMethod() {
//        System.out.println("a = " + a);
        System.out.println("static b = " + b);
    }
}
