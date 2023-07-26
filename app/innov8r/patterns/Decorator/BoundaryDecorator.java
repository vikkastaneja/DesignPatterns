package app.innov8r.patterns.Decorator;

public class BoundaryDecorator extends BaseDecorator {
    String boundary;
    public BoundaryDecorator(Shape shape, String boundary) {
        super(shape);
        this.boundary = boundary;
    }

    public void draw() {
        shape.draw();
        System.out.println(boundary);
    }
}
