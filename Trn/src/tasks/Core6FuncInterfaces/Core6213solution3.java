package tasks.Core6FuncInterfaces;

import java.util.*;

public class Core6213solution3 {
    public static void main(String[] args) {
        Comparator.<Map.Entry<String, Integer>>comparingInt(Map.Entry::getValue)
                .reversed()
                .thenComparing(Map.Entry::getKey);

        Scanner scanner = new Scanner(System.in).useDelimiter("(?U)[^\\p{L}\\p{Digit}]+");
        Map<String, Integer> map = new HashMap<>();

    }
}




