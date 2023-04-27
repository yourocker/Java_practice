package tasks.Core1Base;

import java.util.Arrays;

public class Core1510 {
    public static int[] getArrayMiddle(int[] numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            counter++;
        }

        int[] temp = new int[0];
        if (counter == 0) {
            temp = new int[0];
        } else if (counter % 2 != 0) {
            temp = Arrays.copyOfRange(numbers, counter / 2, counter / 2 + 1);

        } else {
            temp = Arrays.copyOfRange(numbers, counter / 2 - 1, counter / 2 + 1);
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 4, 100, 200, 300, 99, 1, 2};
        System.out.println(Arrays.toString(getArrayMiddle(num)));
    }
}