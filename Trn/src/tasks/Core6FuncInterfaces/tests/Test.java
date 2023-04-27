package tasks.Core6FuncInterfaces.tests;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        Stream.Builder<Integer> streamBuilder = Stream.<Integer>builder()
                .add(0)
                .add(1);
        for (int i = 2; i <= 8; i+= 2) {
            streamBuilder.accept(i);
        }
        streamBuilder
                .add(9)
                .add(10)
                .build()
                .forEach(obj -> System.out.print(obj + ", "));

        System.out.println();

        Stream.of(1, 2, 3)
                .filter(x -> x != 10)
                .forEach(obj -> System.out.print(obj + ", "));

        System.out.println();

        IntStream.range(2, 9)
                .filter(x -> x % 3 == 0)
                .forEach(obj -> System.out.print(obj + ", "));

        System.out.println("\n");

        Stream.of("3", "4", "5")
                .map(Integer::parseInt)
                .map(x -> x +10)
                .forEach(System.out::println);

        System.out.println("\n");

        Stream.of("10", "11", "40")
                .map(x -> Integer.parseInt(x, 16))
                .forEach(System.out::println);

        IntStream.range(0, 100)
                .sorted()
                .limit(20)
                .filter(x -> x % 2 != 0)
                .forEach(i -> System.out.print(i + ", "));

        System.out.println("\n");

        Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5)
                .sorted().takeWhile(x -> x < 0).forEach(System.out::println);

        Stream<String> kazakhPeople = Stream.of("Borat", "Azamat", "Nursultan");
        Stream<String> americanPeople = Stream.of("Pamela", "Tom", "Bush");

        Stream.concat(kazakhPeople, americanPeople).sorted().skip(3).limit(1).forEach(n -> System.out.println(n));
    }
}
