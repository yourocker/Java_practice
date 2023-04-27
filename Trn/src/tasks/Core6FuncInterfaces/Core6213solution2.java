package tasks.Core6FuncInterfaces;

import java.util.*;

public class Core6213solution2 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useDelimiter("(?U)[^\\p{L}\\p{Digit}]+");

    Map<String, Integer> map = new HashMap<>();
    scanner.forEachRemaining(s -> map.merge(s.toLowerCase(), 1, (a, b) -> a + b));

    map.entrySet().stream()
            .sorted(Comparator.<Map.Entry<String, Integer>>comparingInt(Map.Entry::getValue)
                    .reversed()
                    .thenComparing(Map.Entry::getKey))
            .limit(10)
            .map(Map.Entry::getKey)
            .forEach(System.out::println);
}
}
