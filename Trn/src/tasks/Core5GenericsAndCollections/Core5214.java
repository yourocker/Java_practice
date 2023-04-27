package tasks.Core5GenericsAndCollections;

import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Core5214 {
public static Map<String, Long> getSalesMap(Reader reader) {
    Map<String, Long> map = new HashMap<>();
    Scanner scanner = new Scanner(reader);

    while (scanner.hasNext()) {
//        String name = scanner.next();
//        Long salary = scanner.nextLong();
        map.merge(scanner.next(), scanner.nextLong(), Long::sum);
    }
    return map;
}

    public static void main(String[] args) {
        Reader reader = new StringReader("Алексей 3000\n" +
                "Дмитрий 9000\n" +
                "Антон 3000\n" +
                "Алексей 7000\n" +
                "Антон 8000");
        System.out.println(getSalesMap(reader));
    }
}
