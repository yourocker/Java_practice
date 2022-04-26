import java.util.Scanner;

public class Ellipse implements Scale, Move {
    private int centOfEllX;
    private int centOfEllY;
    private int radOfEllA;
    private int radOfEllB;

    public Ellipse(int centOfEllX, int centOfEllY, int radOfEllA, int radOfEllB) {
        this.centOfEllX = centOfEllX;
        this.centOfEllY = centOfEllY;
        this.radOfEllA = radOfEllA;
        this.radOfEllB = radOfEllB;
    }

    public void areaOfEll() {
        if (radOfEllA > 0 && radOfEllB > 0) {
            double areaOfEllRes = Math.PI * radOfEllA * radOfEllB;
            System.out.printf("%s %.2f\n", "Площадь эллипса равна", areaOfEllRes);
        } else {
            System.out.println("Площадь эллипса равна нулю или отрицательна");
        }
    }

    public void perOfEll() {
        if (radOfEllA > 0 && radOfEllB > 0) {
            double perOfEllRes = 4 * ((Math.PI * radOfEllA * radOfEllB + Math.pow((radOfEllA - radOfEllB), 2)) /
                    (radOfEllA + radOfEllB));
            System.out.printf("%s %.2f\n", "Периметр эллипса равен", perOfEllRes);
        } else {
            System.out.println("Периметр эллипса равен нули или отрицательный");
        }
    }

    public int getCentOfEllX() {
        return centOfEllX;
    }

    public int getCentOfEllY() {
        return centOfEllY;
    }

    public int getRadOfEllA() {
        return radOfEllA;
    }

    public int getRadOfEllB() {
        return radOfEllB;
    }

    @Override
    public void move() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи новые координаты центра эллипса по оси X");
        centOfEllX = scanner.nextInt();
        System.out.println("Введи новые координаты центра эллипса по оси Y");
        centOfEllX = scanner.nextInt();
    }

    @Override
    public void changeScale() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи масштаб эллипса");
        int sc = scanner.nextInt();
        radOfEllA *= sc;
        radOfEllB *= sc;
    }
}
