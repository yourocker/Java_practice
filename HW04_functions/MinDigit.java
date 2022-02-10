import java.util.Scanner;

class MinDigit {
	public static int minDigit(int number) {
	int a = 9;
	
	while (number != 0) {
		int b = number % 10; 
			if (b < a) {
			a = b;
			}
		number /= 10;
		}
	return a;
	}

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	int currentNumber = scanner.nextInt();
	int digit = minDigit(currentNumber);

	System.out.println(digit);
	}
}
