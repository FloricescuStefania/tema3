package shapeArea;

public class Circle implements Shape {
    private float radius;

    Circle(float radius) {
        this.radius = radius;
    }
    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }
}