package tasks.Core4Files.Core437;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        double sum = 0.0;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();
                sum += number;
            } else {
                scanner.next();
            }
        }
        System.out.printf("%.6f", sum);
    }
}
