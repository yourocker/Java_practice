package tasks.Core5GenericsAndCollections;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class Core5215 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        int i = 0;
        while (scanner.hasNextInt()) {
            if (i % 2 != 0) {
                numbers.addLast(scanner.nextInt());
            } else scanner.next();
            i++;
        }
        Iterator iterator = numbers.descendingIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
