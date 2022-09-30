public class Ellipse extends Circle implements perimeterAndArea {
    private static final double MIN_RADIUS = 0.0;
    private static final double MAX_RADIUS = 100.0;
    private static final double DEFAULT_RADIUS = 1;

    private double radX;
    private double radY;


    public Ellipse(int centerX, int centerY, double radius, int scale) {
        super(centerX, centerY, radius, scale);
    }
}
