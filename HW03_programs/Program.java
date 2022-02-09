import java.util.Scanner;

class Program {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	int currentNumber = scanner.nextInt();
	int count = 0;

	while(currentNumber != -1) {
		int digitSum = 0;

		while(currentNumber != 0) {
			digitSum += currentNumber % 10;
			currentNumber = currentNumber / 10;
		}
		boolean isPrime = true;

		if(digitSum == 1 || digitSum == 2 || digitSum == 3 ) {
		isPrime = true;
		}
		
		int i = 2;

		while(i < digitSum) {
			if(digitSum % i == 0) {
			isPrime = false;
			break;
			}
			i++;
		}
		if(isPrime == true) {
		count++;
		}
		currentNumber = scanner.nextInt();
		}
	System.out.println(count);
	}
}
