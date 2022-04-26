public class Main {
    public static void main(String[] args) {
        // Начальные данные
        Square square = new Square(40, 2, 3);
        Rectangle rectangle = new Rectangle(10, 7, 1, 6);
        Circle circle = new Circle(3, 10, 9);
        Ellipse ellipse = new Ellipse(55, 32, 10, 3);

        // Реализация методов и интерфейсов
        System.out.printf("\n%s\n", "Квадрат:");
        square.move();
        System.out.println("Координаты центра квадрата [" + square.getCentOfSqX() + "," + square.getCentOfSqY() + "]");
        square.changeScale();
        System.out.println("Сторона квадрата равна " + square.getLenOfSqSide());
        square.areaOfSq();
        square.perOfSq();

        System.out.printf("\n%s\n", "Прямоугольник:");
        rectangle.move();
        System.out.println("Координаты центра прямоугольника [" + rectangle.getCentOfRecX() + "," + rectangle.getCentOfRecY() + "]");
        rectangle.changeScale();
        System.out.println("Сторона А равна " + rectangle.getLenOfRecSideA() + ", Сторона B равна " + rectangle.getLenOfRecSideB());
        rectangle.areaOfRec();
        rectangle.perOfRec();

        System.out.printf("\n%s\n", "Круг:");
        circle.move();
        System.out.println("Координаты центра круга [" + circle.getCentOfCirX() + "," + circle.getCentOfCirY() + "]");
        circle.changeScale();
        System.out.println("Радиус круга равен " + circle.getRadOfCir());
        circle.areaOfCir();
        circle.perOfCir();

        System.out.printf("\n%s\n", "Эллипс:");
        ellipse.move();
        System.out.println("Координаты центра эллипса [" + ellipse.getCentOfEllX() + "," + ellipse.getCentOfEllY());
        ellipse.changeScale();
        System.out.println("Полуось A равна " + ellipse.getRadOfEllA() + ", Полуось B равна " + ellipse.getRadOfEllB());
        ellipse.areaOfEll();
        ellipse.perOfEll();
    }
}

