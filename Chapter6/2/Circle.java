public class Circle implements GeometricObject {
    protected double radius = 1.0;

    public Circle(double radius) {
        self.radius = radius;
    }
    public double getPerimeter() {
        return self.radius * 2 * Math.PI;
    }
    public double getArea() {
        return self.radius * self.radius * Math.PI;
    }
}