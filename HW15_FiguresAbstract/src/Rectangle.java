public class Rectangle extends Square implements perimeterAndArea {
    private static final int MIN_SIDE = 1;

    private int sideB;

    public Rectangle (int centerX, int centerY, int scale, int side, int sideB) {
        super(centerX, centerY, scale, side);

        if (sideB >= MIN_SIDE) {
            this.sideB = sideB;
        } else {
            this.sideB = MIN_SIDE;
        }
    }

    @Override
    public void getPerimeter() {
        double perimeter;
        perimeter = (side + sideB) * 2;
        System.out.println("Perimeter of rectangle = " + perimeter);
    }

    @Override
    public void getArea() {
        double area;
        area = (side * sideB);
        System.out.println("Area of rectangle = " + area);
    }
}
