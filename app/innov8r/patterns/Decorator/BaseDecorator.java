package app.innov8r.patterns.Decorator;

abstract class BaseDecorator implements Shape {
    Shape shape;
    public BaseDecorator(Shape shape) {
        this.shape = shape;
    }
}
