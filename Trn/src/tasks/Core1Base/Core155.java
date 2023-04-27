package tasks.Core1Base;

public class Core155 {
    public static int[] getArrayMiddle(int[] numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            counter++;
        }

        int[] temp = new int[0];
        if (counter == 0) {
            int j = 0;
            temp = new int[j];
        } else if (counter % 2 != 0) {
            int j = 1;
            temp = new int[j];
            temp[0] = numbers[counter / 2];
        } else {
            int j = 2;
            temp = new int[j];
            temp[0] = numbers[counter / 2 - 1];
            temp[1] = numbers[(counter / 2)];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 4, 100, 200, 300, 99, 1, 22};
        getArrayMiddle(num);
    }
}