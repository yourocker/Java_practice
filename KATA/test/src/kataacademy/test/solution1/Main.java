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
        for (int i = array.length - 1; i >= 0; i--)
            if (array[i] == ' ') {
                j = i;
                i = 0;
                power = 1;
            } else if (array[i] == '+' || array[i] == '-' || array[i] == '/' || array[i] == '*') {
                operandCounter++;
                j = i;
                i = 0;
                power = 1;
            } else {
                int charToInt = Character.getNumericValue(array[i]);
                secondNum += charToInt * power;
                System.out.println("значение переменной 2 " + secondNum);
                power *= 10;
            }

        //парсим первое число до конца строки или символа
        for (int i = j; i >= 0; i--) {
            if (array[i] == ' ') {
            } else if (array[i] == '+' || array[i] == '-' || array[i] == '/' || array[i] == '*') {
                operandCounter++;
            } else {
                int charToInt = Character.getNumericValue(array[i]);
                firstNum += charToInt * power;
                System.out.println("значение переменной 1 " + firstNum);
                power *= 10;
            }
        }

        //обработка исключений по операндам
        if (operandCounter == 2)
            throw new OperandException("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        else if (operandCounter > 2)
            throw new OperandException("т.к. формат математической операции не удовлетворяет заданию - более двух операндов и один оператор (+, -, /, *)");
        else if (operandCounter < 1) {
            throw new OperandException("т.к. строка не является математической операцией");
        }
    }
}

//TODO: 1. проверить почему не обрабатываются буквенные символы (Char => int) вводятся буквы, а номер символа не соответствует таблице ASCII
//TODO: 2. Если символы будут считываться адекватно, выставить ограничения по символам (цифры/буквы), вычленить римские буквы для выполнения операций
//TODO: 3. Не должно быть смешанных операций. Поставить переменные: boolean romanNumerals, boolean arabicNumerals. Если оба значения == true - выбрасывать исключение
//TODO: 4. Сделать процессор перевода римских цифр в арабские
//TODO: 5. Сделать класс исключений по числовым ошибкам NumeralsException