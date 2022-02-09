import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if(number == 0 || number == 1) {
		System.out.println("Undefined");
		}
		else if(number % 2 == 0) {
			System.out.println("EVEN");
			}
		else {
		System.out.println("ODD");
		}
	}
}
