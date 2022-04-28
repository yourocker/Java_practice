public class Square extends Figure implements perimeterAndArea {
    private static final int MIN_SIDE = 1;

    protected int side;

    public Square(int centerX, int centerY, int scale, int side) {
        super(centerX, centerY, scale);

        if (side >= MIN_SIDE) {
            this.side = side;
        } else {
            this.side = MIN_SIDE;
        }
    }

    @Override
    public void getPerimeter() {
        double perimeter;
        perimeter = side * 4;
        System.out.println("Perimeter of square = " + perimeter);
    }

    @Override
    public void getArea() {
        double area;
        area = side * side;
        System.out.println("Area of square = " + area);
    }
}

//        @Override
//        public void getPerimeter() {
//            double perimeter;
//            perimeter = side * 4;
//            System.out.println("Perimeter of square = " + perimeter);
//        }
//
//        @Override
//        public void getArea() {
//            double area;
//            area = side * side;
//            System.out.println("Area of square = " + area);
//        }
