package tasks.Core1Base;

import java.util.Arrays;

public class Core157 {
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] tempArray = new int[firstArray.length + secondArray.length];
        int j = 0;

        for (int i = 0; i < firstArray.length; i++) {
            tempArray[i] = firstArray[i];
            j++;
        }

        for (int i = 0; i < secondArray.length; i++) {
            tempArray[j] = secondArray[i];
            j++;
        }

        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < tempArray.length - 1; i++) {
                if (tempArray[i] > tempArray[i + 1]) {
                    temp = tempArray[i];
                    tempArray[i] = tempArray[i + 1];
                    tempArray[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(tempArray));
        return tempArray;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {3, 6, 22};
        int[] arr2 = new int[] {98, 1, 7};
        mergeAndSort(arr1, arr2);
    }
}
