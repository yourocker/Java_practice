package tasks.Core1Base;

import java.math.BigInteger;

public class Core148 {
    public static BigInteger factorial(int value) {
        BigInteger result;
        if (value <= 1) {
            result = BigInteger.valueOf(1);
            return result;
        }
        result = BigInteger.valueOf(value).multiply(factorial(value - 1));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(9));
    }
}
