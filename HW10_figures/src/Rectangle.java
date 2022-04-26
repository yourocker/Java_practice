import java.util.Scanner;

public class Rectangle implements Scale, Move {
    private int centOfRecX;
    private int centOfRecY;
    private int lenOfRecSideA;
    private int lenOfRecSideB;

    public Rectangle(int centOfRecX, int centOfRecY, int lenOfRecSideA, int lenOfRecSideB) {
        this.centOfRecX = centOfRecX;
        this.centOfRecY = centOfRecY;
        this.lenOfRecSideA = lenOfRecSideA;
        this.lenOfRecSideB = lenOfRecSideB;
    }

    public void areaOfRec() {
        if (lenOfRecSideA > 0 && lenOfRecSideB > 0) {
            int areaOfRecRes = lenOfRecSideA * lenOfRecSideB;
            System.out.println("Площадь прямоугольника равна " + areaOfRecRes);
        } else {
            System.out.println("Площадь прямоугольника равна нулю или отрицательна");
        }
    }

    public void perOfRec() {
        if ((lenOfRecSideA * lenOfRecSideB) != 0) {
            int perOfRecRes = (lenOfRecSideA + lenOfRecSideB) * 2;
            System.out.println("Периметр прямоугольника равен " + perOfRecRes);
        } else {
            System.out.println("Одна из сторон прямоугольника равна нулю");
        }
    }

    public int getCentOfRecX() {
        return centOfRecX;
    }

    public int getCentOfRecY() {
        return centOfRecY;
    }

    public int getLenOfRecSideA() {
        return lenOfRecSideA;
    }

    public int getLenOfRecSideB() {
        return lenOfRecSideB;
    }

    @Override
    public void move() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи новые координаты центра прямоугольника по оси X");
        centOfRecX = scanner.nextInt();
        System.out.println("Введи новые координаты центра прямоугольника по оси Y");
        centOfRecY = scanner.nextInt();
    }

    @Override
    public void changeScale() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи масштаб прямоугольника");
        int sc = scanner.nextInt();
        lenOfRecSideA *= sc;
        lenOfRecSideB *= sc;
    }
}
