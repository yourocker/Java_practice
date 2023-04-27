package tasks.Core1Base;

import java.util.Arrays;

public class Core1511 {
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] temp = new int[firstArray.length + secondArray.length];
        int j = 0;

        for (int i = 0; i < firstArray.length; i++) {
            temp[i] = firstArray[i];
            j++;
        }

        for (int i = 0; i < secondArray.length; i++) {
            temp[j] = secondArray[i];
            j++;
        }

        Arrays.sort(temp);
        //System.out.println(Arrays.toString(temp));
        return temp;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {3, 6, 22};
        int[] arr2 = new int[] {98, 1, 7};
        mergeAndSort(arr1, arr2);
    }
}
