package tasks.Core6FuncInterfaces;
import java.math.BigInteger;
import java.util.stream.*;

public class Core6215 {
    public static BigInteger factorial(int value) {
        if (value < 2) {
            return BigInteger.valueOf(1);
        } else {
            return IntStream.rangeClosed(2, value)
                    .parallel()
                    .mapToObj(BigInteger::valueOf)
                    .reduce(BigInteger::multiply)
                    .get();
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(500));
    }
}
