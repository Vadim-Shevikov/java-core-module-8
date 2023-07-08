public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    private double x;
    private double y;

    public Triangle(double sideA, double sideB, double sideC, double x, double y) {
        super("Triangle");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.x = x;
        this.y = y;
    }

    public double getSideA() {
        return this.sideA;
    }
    public double getSideB() {
        return this.sideB;
    }

    public double getSideC() {
        return this.sideC;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public void draw() {
        System.out.println("Drawing a Triangle with sides " + this.sideA + ", " + this.sideB + ", " + this.sideC);
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