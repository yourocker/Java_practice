import java.util.Scanner;

class Program1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		int sum = 0;

		while (number != 0) {
			sum = sum + number % 10;
			number = number / 10;
		}
		System.out.println(sum);
	}
}
