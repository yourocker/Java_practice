package kataacademy.test.solution1;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws OperandException {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.trim();
        input = input.toUpperCase(Locale.ROOT);

        int firstNum = 0;
        int secondNum = 0;
        int j = 0;
        int operandCounter = 0;

        char[] array = input.toCharArray();

        //проверка выражения на одно арифметическое действие
//        for (int i = 0; i < array.length; i++) {
//            switch (array[i]) {
//                case ' ':
//                case '+':
//                case '-':
//                case '/':
//                case '*':
//                    operandCounter ++;
//            }
//        }

//        if (operandCounter < 1 || operandCounter > 1) {
//            System.err.println("количество операций не равно 1");
//        }

        int power = 1;

        //парсим второе число до символа или пробела
        for (int i = array.length - 1; i >= 0; i--) {
            switch (array[i]) {
                case ' ' -> {
                    j = i;
                    i = 0;
                    power = 1;
                }
                case '+', '-', '/', '*' -> {
                    operandCounter++;
                    j = i;
                    i = 0;
                    power = 1;
                }
                default -> {
                    int charToInt = Character.getNumericValue(array[i]);
                    secondNum += charToInt * power;
                    System.out.println("значение переменной 2 " + secondNum);
                    power *= 10;
                }
            }
        }

        //парсим первое число до конца строки или символа
        for (int i = j; i >= 0; i--) {
            switch (array[i]) {
                case ' ':
                    break;
                case '+':
                case '-':
                case '/':
                case '*':
                    operandCounter ++;
                    break;
                default:
                    int charToInt = Character.getNumericValue(array[i]);
                    firstNum += charToInt * power;
                    System.out.println("значение переменной 1 " + firstNum);
                    power *= 10;
            }
        }

        //обработка исключений по операндам
        if (operandCounter == 2) {
            throw new OperandException("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        else if (operandCounter > 2) {
            throw new OperandException("throws Exception //т.к. формат математической операции не удовлетворяет заданию - более двух операндов и один оператор (+, -, /, *)");
        }
        else if (operandCounter < 1) {
            throw new OperandException("throws Exception //т.к. строка не является математической операцией");
        }
    }
}