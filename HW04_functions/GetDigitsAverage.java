import java.util.Scanner;

class GetDigitsAverage {
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

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	double result = getDigitsAverage(scanner.nextInt());
	System.out.println(result);
	}
}
