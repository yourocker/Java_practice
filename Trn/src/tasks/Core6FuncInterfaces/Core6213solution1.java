package tasks.Core6FuncInterfaces;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Core6213solution1 {
    public static void main(String[] args) {

        Stream<String> scanner = new Scanner(System.in)
                .useDelimiter("(?U)[^\\p{L}\\p{Digit}]+")
                .tokens();

        Map<String, Long> result =
                scanner
                        .collect(Collectors.groupingBy(
                                Function.identity(), Collectors.counting()));

        Map<String, Long> map = new LinkedHashMap<>();

        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed()).forEachOrdered(e -> map.put(e.getKey(), e.getValue()));
        System.out.println(map);
    }
}
