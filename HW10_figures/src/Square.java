import java.util.Scanner;

public class Square implements Scale, Move {
    private int centOfSqX;
    private int centOfSqY;
    private int lenOfSqSide;

    public Square(int centOfSqX, int centOfSqY, int lenOfSqSide) {
        this.centOfSqX = centOfSqX;
        this.centOfSqY = centOfSqY;
        this.lenOfSqSide = lenOfSqSide;
    }

    public void areaOfSq() {
        if (lenOfSqSide > 0) {
            int areaOfSqRes = lenOfSqSide * lenOfSqSide;
            System.out.println("Площадь квадрата равна " + areaOfSqRes);
        } else {
            System.out.println("Площадь меньше или равна нулю!!!");
        }
    }

    public void perOfSq() {
        if (lenOfSqSide > 0) {
            int perOfSqRes = lenOfSqSide * 4;
            System.out.println("Периметр квадрата равен " + perOfSqRes);
        } else {
            System.out.println("Периметр меньше или равен нулю!!!");
        }
    }

    public int getCentOfSqX() {
        return centOfSqX;
    }

    public int getCentOfSqY() {
        return centOfSqY;
    }

    public int getLenOfSqSide() {
        return lenOfSqSide;
    }

    @Override
    public void move() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи новые координаты центра квадрата по оси X");
        centOfSqX = scanner.nextInt();
        System.out.println("Введи новые координаты центра квадрата по оси Y");
        centOfSqY = scanner.nextInt();
    }

    @Override
    public void changeScale() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи масштаб квадрата");
        lenOfSqSide *= scanner.nextInt();
    }
}
