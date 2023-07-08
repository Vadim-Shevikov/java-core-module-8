public class Circle extends Shape {
    private double radius;
    private double x;
    private double y;

    public Circle(double radius, double x, double y) {
        super("Circle");
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a Circle with radius " + this.radius);
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
}
