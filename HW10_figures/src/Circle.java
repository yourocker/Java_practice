import java.util.Scanner;

public class Circle implements Scale, Move {
    private int centOfCirX;
    private int centOfCirY;
    private double radOfCir;

    public Circle(int centOfCirX, int centOfCirY, int radOfCir) {
        this.centOfCirX = centOfCirX;
        this.centOfCirY = centOfCirY;
        this.radOfCir = radOfCir;
    }

    public void areaOfCir() {
        if (radOfCir > 0) {
            double areaOfCirRes = Math.PI * Math.pow(radOfCir, 2);
            System.out.printf("%s %.2f\n", "Площадь круга равна", areaOfCirRes);
        } else {
            System.out.println("Нулевой или отрицательный радиус");
        }
    }

    public void perOfCir() {
        if (radOfCir > 0) {
            double perOfCirRes = 2 * Math.PI * radOfCir;
            System.out.printf("%s %.2f\n", "Периметр круга равен", perOfCirRes);
        } else {
            System.out.println("Нулевой или отрицательный радиус");
        }
    }

    public int getCentOfCirX() {
        return centOfCirX;
    }

    public int getCentOfCirY() {
        return centOfCirY;
    }

    public double getRadOfCir() {
        return radOfCir;
    }

    @Override
    public void move() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи новые координаты центра круга по оси X");
        centOfCirX = scanner.nextInt();
        System.out.println("Введи новые координаты центра круга по оси Y");
        centOfCirY = scanner.nextInt();
    }

    @Override
    public void changeScale() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи масштаб круга");
        radOfCir *= scanner.nextInt();
    }
}