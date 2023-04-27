package tasks.Test;

public class Test {
    static class Car implements Cloneable {
        private int number;
        private static String name;

        static void changeNumber (String number) {
            name = number;
            System.out.println("string method");
        }

        int changeNumber (int number) {
            this.number = number;
            return number;
        }
        @Override
        public void finalize() {
            System.out.println("Объекты удалены");
        }
    }

    public static void main(String[] args) {
        Car volvo = new Car();
        Car audi = new Car();
        System.out.println(audi.hashCode());
        System.out.println(volvo.hashCode());
        System.out.println(volvo.equals(audi));
        System.out.println(volvo.getClass() == audi.getClass());
        System.out.println(volvo instanceof Car);
        volvo.changeNumber(666);
        volvo.changeNumber("zalupa");
        System.out.println(volvo.name);
        volvo.changeNumber(888);
        System.out.println(volvo.number);
    }
}
