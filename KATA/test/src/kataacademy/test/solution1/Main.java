package kataacademy.test.solution1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws OperandException, SymbolException {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.trim();
        input = input.toUpperCase(Locale.ROOT);

        int firstNum = 0;
        int secondNum = 0;
        char operand = '0';
        int operandCounter = 0;
        boolean arabicNumerals = false;
        boolean romanNumerals = false;
        boolean operands = false;

        char[] array = input.toCharArray();

        //проверяем строку на арабские цифры, римские цифры и операнды
        for (char c : array) {
            //arabic numerals
            if (c >= 48 && c < 58) {
                arabicNumerals = true;
                //roman numerals
            } else if (c == 'I' || c == 'V' || c == 'X') {
                romanNumerals = true;
                //operands
            } else if (c == '+' || c == '-' || c == '/' || c == '*') {
                operandCounter++;
                operands = true;
            } else if (c == ' ') {

            } else {
                throw new SymbolException("Недопустимый символ " + "'" + c + "'");
            }

        }

        if (arabicNumerals && !romanNumerals) {
            //парсим второе число до символа или пробела
            int power = 1;
            int j = 0;
            for (int i = array.length - 1; i >= 0; i--)
                if (array[i] == ' ') {
                    j = i;
                    i = 0;
                    power = 1;
                } else if (array[i] == '+' || array[i] == '-' || array[i] == '/' || array[i] == '*') {
                    j = i;
                    i = 0;
                    power = 1;
                } else {
                    secondNum += Character.getNumericValue(array[i]) * power;
                    System.out.println("значение переменной 2=" + secondNum);
                    power *= 10;
                }

            //парсим первое число до конца строки, если попадаются операнды - считаем их
            for (int i = j; i >= 0; i--) {
                if (array[i] == ' ') {  //не очень хорошее решение, но пока не знаю как иначе
                } else if (array[i] == '+' || array[i] == '-' || array[i] == '/' || array[i] == '*') {
                    operand = array[i];
                } else {
                    firstNum += Character.getNumericValue(array[i]) * power;
                    System.out.println("значение переменной 1=" + firstNum);
                    power *= 10;
                }
            }
        }

        if (romanNumerals && !arabicNumerals) {
            StringBuilder firstRomNumber = new StringBuilder();
            StringBuilder secondRomNumber = new StringBuilder();
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == ' ') {
                    j = i;
                    i = array.length;
                } else if (array[i] == '+' || array[i] == '-' || array[i] == '/' || array[i] == '*') {
                    operand = array[i];
                    j = i;
                    i = array.length;
                } else {
                    firstRomNumber.append(array[i]);
                }
            }

            for (int i = j; i < array.length; i++) {
                if (array[i] == ' ') {
                } else if (array[i] == '+' || array[i] == '-' || array[i] == '/' || array[i] == '*') {
                    operand = array[i];
                } else {
                    secondRomNumber.append(array[i]);
                }
            }
            RomanNumber romanNumber1 = RomanNumber.valueOf(firstRomNumber.toString());
            RomanNumber romanNumber2 = RomanNumber.valueOf(secondRomNumber.toString());
            firstNum = romanNumber1.getNumber();
            secondNum = romanNumber2.getNumber();

            System.out.println("первая переменная = " + firstNum);
            System.out.println("вторая переменная = " + secondNum);
        }

        System.out.println("операнд " + operand);

        //обработка исключений по операндам
        if (operands) {
            if (operandCounter == 2)
                throw new OperandException("формат математической операции не удовлетворяет заданию - два операнда (+, -, /, *)");
            else if (operandCounter > 2)
                throw new OperandException("формат математической операции не удовлетворяет заданию - более двух операндов (+, -, /, *)");
        } else {
            throw new OperandException("строка не является математической операцией");
        }
        //обработка исключения систем счислений
        if (romanNumerals && arabicNumerals) {
            throw new SymbolException("используются одновременно разные системы счисления");
        }
    }
}

/*
TODO    Разобрать код из одной страницы в классы и процедуры в соответствии с заданием
        Цифры получили, сделать калькулятор))
        Добавить проверку на правильность введения римских цифр (enum?)
        Добавить ограничение по цифрам (<10)
*/
