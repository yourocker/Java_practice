public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(12,12,3,-12);
        Rectangle rectangle = new Rectangle(1,1,1,12,2);

        circle.getPerimeter();
        circle.getArea();

        rectangle.getPerimeter();
        rectangle.getArea();
    }
}
