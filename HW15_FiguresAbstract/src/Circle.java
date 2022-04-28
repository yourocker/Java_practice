public class Circle extends Figure implements perimeterAndArea {
    private static final double MIN_RADIUS = 0.0;
    private static final double MAX_RADIUS = 100.0;
    private static final double DEFAULT_RADIUS = 1;

    private double radius;

    public Circle (int centerX, int centerY, double radius, int scale) {
        super(centerX, centerY, scale);

        if (radius > MIN_RADIUS && radius <= MAX_RADIUS) {
            this.radius = radius;
        } else {
            this.radius = DEFAULT_RADIUS;
        }
    }

    @Override
    public void getPerimeter() {
        double perimeter;
        perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of circle = " + perimeter);
    }

    @Override
    public void getArea() {
        double area;
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of circle = " + area);
    }

//    @Override
//    public void getPerimeter() {
//        double perimeter;
//        perimeter = 2 * Math.PI * radius;
//        System.out.println("Perimeter of circle = " + perimeter);
//    }
//
//    @Override
//    public void getArea() {
//        double area;
//        area = Math.PI * Math.pow(radius, 2);
//        System.out.println("Area of circle = " + area);
//    }
}
