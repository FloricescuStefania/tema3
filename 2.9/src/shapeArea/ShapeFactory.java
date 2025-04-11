package shapeArea;

public class ShapeFactory {
    public static Shape createShape(float... dimensions) throws UnknownShapeException {

        if(dimensions.length == 1) {
            return new Circle(dimensions[0]);
        } else if (dimensions.length == 2){
            return new Rectangle(dimensions[0], dimensions[1]);
        } else {
            throw new UnknownShapeException("Unknown shape. Can not calculate area!");
        }
    }
}