import java.util.Scanner;

class Program1 {
	public static int calculateDigitSum(int number) {
	int digitSum = 0;

 	while(number != 0) {
		result += number % 10;
		number = number / 10;
		}
	return result;
	}

	public static boolean isPrime(int number) {
	 	if (number == 1 || number == 2 || number == 3 ) {
			return  true;
		}
		for (i = 2; i < number; i++) {
			if (number % i == 0) {
			return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	int currentNumber = scanner.nextInt();
	int count = 0;

	while (currentNumber != -1) {
		int digitSum = calculateDigitSum(currentNumber);

		}
		if (isPrime(digitSum)) {
			count++;
		}
		currentNumber = scanner.nextInt();
	}
	System.out.println(count);
}
