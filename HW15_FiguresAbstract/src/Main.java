public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(12,12,3,12);
        Rectangle rectangle = new Rectangle(1,1,1,12,2);
        Ellipse ellipse = new Ellipse(1, 6, 3,9);
        Square square = new Square(0, 6, 28, 2);

        circle.getPerimeter();
        circle.getArea();

        rectangle.getPerimeter();
        rectangle.getArea();

        ellipse.getPerimeter();
        ellipse.getArea();

        square.getArea();
        square.getPerimeter();



    }
}
