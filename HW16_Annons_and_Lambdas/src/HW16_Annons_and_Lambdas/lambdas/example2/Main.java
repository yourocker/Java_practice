package HW16_Annons_and_Lambdas.lambdas.example2;

public class Main {
    public static void main(String[] args) {
        int elements[] = {3, 10, 24, 11, 15, 10, 11232, 13411, 33, 25, 16};

        Sequence sequence = new Sequence(elements);

         sequence
                .filter(number -> number % 2 == 0)
                .map(number -> {
                    int sum = 0;
                    while (number != 0) {
                        sum += number % 10;
                        number = number / 10;
                    }
                    return sum;
                })
                .filter(number -> number % 2 == 1)
                .forEach(number -> System.out.println("Элемент последовательности - " + number));
    }
}