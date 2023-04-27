package tasks.Core1Base;

import java.util.Arrays;

public class Core154 {
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > start && numbers[i] < end) {
                j++;
            }
        }
        int[] temp = new int[j];
        int x = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > start && numbers[i] < end) {
                temp[x] = numbers[i];
                x++;
            }
        }
        System.out.println(Arrays.toString(temp));
        return temp;
    }

    public static void main(String[] args) {
        int[] num = new int[]{1, 2};
        getSubArrayBetween(num, 3, 101);
    }
}
