public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(2, 0, 0);
        Shape quad = new Quad(2.5d, 1, 1);
        Shape triangle = new Triangle(1, 2, 3, 2,2);
        Shape pentagon = new Pentagon(5, 3,3);
        Shape hexagon = new Hexagon(15, 4,4);

        ShapePrinter.printShapeName(circle);
        ShapePrinter.printShapeName(quad);
        ShapePrinter.printShapeName(triangle);
        ShapePrinter.printShapeName(pentagon);
        ShapePrinter.printShapeName(hexagon);
    }
}