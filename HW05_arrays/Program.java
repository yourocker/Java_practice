import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введи размер массива");
		int agesCount = scanner.nextInt();
		int ages[] = new int[agesCount];

		for (int i = 0; i < ages.length; i++) {
			ages[i] = scanner.nextInt();
		}

		double agesSum = 0;
		
		for (int i = 0; i < ages.length; i++) {
			agesSum += ages[i];
		}

		double average = agesSum / agesCount;
		System.out.println(average);
	}
}
