package tasks.Core6FuncInterfaces.tests;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Core6211 {
    public static IntStream pseudoRandomStream (int seed) {
        return IntStream.iterate(seed, x -> ((x * x) / 10 % 1000));
    }

    private static IntStream mid (int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pseudoRandomStream(13).toArray()));
    }
}