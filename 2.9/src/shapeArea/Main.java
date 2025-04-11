package shapeArea;

/* Design solution for computing area of rectangle passing 2 float numbers (width and height)
and circle, passing one float number (radius). How can I give the two numbers or one number
to the class ? What can I get the area of the selected shape ? Investigate if possible
to use Factory to decide what Shape is involved. */
// FACTORY PATTERN

public class Main {
    public static void main(String[] args) {

        try {
            Shape rectangle = ShapeFactory.createShape(5, 1);
            System.out.println("Rectangle area is " + rectangle.getArea());

            Shape circle = ShapeFactory.createShape(1);
            System.out.println("Circle area is " + circle.getArea());

            Shape shape = ShapeFactory.createShape();
            System.out.println("Circle area is " + shape.getArea());
        } catch (UnknownShapeException e) {
            System.out.println(e.getMessage());
        }
    }
}

class UnknownShapeException extends Exception {
    public UnknownShapeException(String message) {
        super(message);
    }
}