public abstract class Shape implements Drawable, Positioned {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}