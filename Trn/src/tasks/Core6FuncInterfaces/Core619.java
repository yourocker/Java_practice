package tasks.Core6FuncInterfaces;

import java.util.function.UnaryOperator;

public class Core619 {
    public static UnaryOperator<Integer> sqrt() {
        return x -> x * x;
    }

    public static void main(String[] args) {

        System.out.println(sqrt());
    }
}
