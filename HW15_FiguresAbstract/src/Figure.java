public abstract class Figure {
    private static final int MAX_XY = 2147483647;
    private static final int MIN_XY = -2147483648;
    private static final int DEFAULT_X = 0;
    private static final int DEFAULT_Y = 0;

    private static final double MIN_SCALE = 0;
    private static final double MAX_SCALE = 100;
    private static final double DEFAULT_SCALE = 1;

    protected int centerX;
    protected int centerY;
    protected double scale;

    public Figure(int centerX, int centerY, double scale) {
        if (centerX <= MAX_XY && centerX >= MIN_XY) {
            this.centerX = centerX;
        } else {
            this.centerX = DEFAULT_X;
        }

        if (centerY <= MAX_XY && centerY >= MIN_XY) {
            this.centerY = centerY;
        } else {
            this.centerY = DEFAULT_Y;
    }

        if (scale > MIN_SCALE && scale <= MAX_SCALE) {
            this.scale = scale;
        } else {
            System.err.println("Scale is out of range. Scale = 1");
            this.scale = DEFAULT_SCALE;
        }
    }

    //public abstract void getPerimeter();

    //public abstract void getArea();

}
