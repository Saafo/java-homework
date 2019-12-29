public class Circle implements GeometricObject {
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}