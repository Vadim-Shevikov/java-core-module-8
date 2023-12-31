public class Pentagon extends Shape implements Polygon {
    private double sideLength;
    private double x;
    private double y;

    public Pentagon(double sideLength, double x, double y) {
        this.sideLength = sideLength;
        this.x = x;
        this.y = y;
    }

    public double getSideLength() {
        return this.sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public void draw() {
        System.out.println("Drawing a Pentagon with side length " + this.sideLength);
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String getName() {
        return "Pentagon";
    }
}
