package app.innov8r.patterns.Decorator;

public class ColorDecorator extends BaseDecorator {

    String color;
    public ColorDecorator(Shape shape, String color) {
        super(shape);
        this.color = color;
    }

    public void draw() {
        shape.draw();
        System.out.println(this.color);
    }
}
