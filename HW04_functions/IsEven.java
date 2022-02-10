import java.util.Scanner;

class IsEven {
	public static boolean isEven (int number) {
	int a = number % 2;
		if (a == 0) {
		return true;
		}
		else {
		return false;
		}
	}

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	boolean result = isEven(scanner.nextInt());
	System.out.println(result);
	}
}
