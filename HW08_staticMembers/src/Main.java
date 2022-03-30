public class Main {

    public static void main(String[] args) {
	    SomeClass object1 = new SomeClass();
        object1.a = 10;
        object1.b = 40;
        SomeClass object2 = new SomeClass();
        object2.a = 20;
        object2.b = 50;
        SomeClass object3 = new SomeClass();
        object3.a = 30;
        object3.b = 60;

        SomeClass.b = 80;

        System.out.println(object1.b);
        System.out.println(object2.b);
        System.out.println(object3.b);

        object1.method();
        object2.method();
        object3.method();

        SomeClass.staticMethod();
    }
}
