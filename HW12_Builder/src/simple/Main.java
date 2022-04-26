package simple;

public class Main {
    public static void main(String[] args) {
        Number number = new Number();
        number.plus(10).minus(5).plus(7).minus(11);

        System.out.println(number.getValue());
    }
}
