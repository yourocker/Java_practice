package kataacademy.test;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static String calc(@NotNull String input) throws OperandException, SymbolException {

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
        //парсер строки с арабскими цифрами
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
                    power *= 10;
                }

            //парсим первое число до конца строки, если попадаются операнды - считаем их
            for (int i = j; i >= 0; i--) {
                if (array[i] == ' ') {  //не очень хорошее решение, но пока не знаю как иначе
                } else if (array[i] == '+' || array[i] == '-' || array[i] == '/' || array[i] == '*') {
                    operand = array[i];
                } else {
                    firstNum += Character.getNumericValue(array[i]) * power;
                    power *= 10;
                }
            }
        }
        //парсер строки с римскими цифрами
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

            firstNum = romanToArabic(String.valueOf(firstRomNumber));
            secondNum = romanToArabic(String.valueOf(secondRomNumber));

            if (firstNum < 1 || firstNum > 10 || secondNum < 1 || secondNum > 10) {
                throw new SymbolException("введенные римские цифры должны быть в диапазоне от I до X");
            }
        }
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
        //обработка по размеру чисел
        if (firstNum > 10 || secondNum > 10 || firstNum < 1 || secondNum < 1)
            throw new SymbolException("введенные числа должны быть от 1 до 10");

        //блок калькулятора
        int tempResult;
        String result = null;
        switch (operand) {
            case '-':
                tempResult = firstNum - secondNum;
                result = Integer.toString(tempResult);
                break;
            case '+':
                tempResult = firstNum + secondNum;
                result = Integer.toString(tempResult);
                break;
            case '*':
                tempResult = firstNum * secondNum;
                result = Integer.toString(tempResult);
                break;
            case '/':
                tempResult = firstNum / secondNum;
                result = Integer.toString(tempResult);
                break;
        }

        if (romanNumerals) {
            result = arabicToRoman(Integer.parseInt(result));
        }

        return result;
    }

    public static int romanToArabic(@NotNull String input) {
        String romanNumeral = input.toUpperCase(Locale.ROOT);
        int result = 0;

        List romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;

        while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
            RomanNumeral symbol = (RomanNumeral) romanNumerals.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }
        return result;
    }

    public static @NotNull String arabicToRoman(int number) throws SymbolException {
        if ((number <= 0) || (number > 4000)) {
            throw new SymbolException("в римской системе нет отрицательных чисел");
        }

        List romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            RomanNumeral currentSymbol = (RomanNumeral) romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                stringBuilder.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) throws OperandException, SymbolException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.trim();
        input = input.toUpperCase(Locale.ROOT);

        System.out.println(calc(input));
    }
}