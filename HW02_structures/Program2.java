import java.util.Scanner;

class Program2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = 0; // счётчик чисел
		int j = 0; // счётчик чисел с суммой меньше 18
		int sum = 0; // сумма цифр

		while(i < 10) {
			int number = scanner.nextInt();
			while (number != 0) {
				sum = sum + number % 10;
				number = number/ 10;
				if(sum < 18) {
					j++;
				}
			}
			i++;
		}
		System.out.println(j);
	}
}
