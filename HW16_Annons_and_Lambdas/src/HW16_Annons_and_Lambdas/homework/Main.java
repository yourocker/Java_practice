package HW16_Annons_and_Lambdas.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {120345, 543021, 90876, 67089};

        NumberAndStringProcessor numberAndStringProcessor = new NumberAndStringProcessor(array);

        numberAndStringProcessor
                .invertNum(number -> {});

        System.out.println(Arrays.toString(array));
    }
}
