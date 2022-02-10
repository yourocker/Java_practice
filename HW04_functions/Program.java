import java.util.Scanner;

class Program {
	public static boolean isEven (int number) {
	int a = number % 2;
		if (a == 0) {
		return true;
		}
		else {
		return false;
		}
	}

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

	public static double getDigitsAverage(int number) {
		double i = 0;
		double a = 0;

		while (number != 0) {
			a += number % 10;
			number /= 10;
			i++;
		}
		double b = a / i;
		return(b);
	}

	public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int a = scanner.nextInt();
		while (a != -1) {
			if (isEven(a) == true) {
				System.out.println(minDigit(a));
			}
			else {
				System.out.println(getDigitsAverage(a));
			}
		a = scanner.nextInt();
		}
	}
}
