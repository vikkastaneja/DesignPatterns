package app.innov8r.patterns.Decorator;

public class Program {
   public static void main(String[] args) {
     // Draw a basic shape
    Shape circle = new Circle();


    // Decorate this shape first with a color
    BaseDecorator redCircle = new ColorDecorator(circle, "red");
    
    // Decorate this already decorated shape with dotted boundary
    BaseDecorator dottedRedCircle = new BoundaryDecorator(redCircle, "dotted");

    dottedRedCircle.draw();
   }
}
