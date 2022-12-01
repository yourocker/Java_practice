package HW16_Annons_and_Lambdas.homework;

public class NumberAndStringProcessor {
    private int[] array;

    public NumberAndStringProcessor(int[] array) {
        this.array = array;
    }

    public NumberAndStringProcessor invertNum(InvertNumber invertNumber) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int newValue = 0;

            while (temp != 0) {
                int digit = temp % 10;
                newValue += digit;
                newValue *= 10;
                temp /= 10;
            }
            array[i] = newValue / 10;
        }
        return new NumberAndStringProcessor(array);
    }

    public int removeZeros(int removeZeros) {
        int newArray[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = removeZeros(array[i]);
        }
        return removeZeros;
    }
}
