public abstract class Shape{
    private String color;
    private boolean filled;

    Shape(){}
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }
    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    /**
     * @param filled the filled to set
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
    public abstract String toString();
}

class Circle extends Shape{
    private double radius;
    Circle(){};
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }
    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    double getPerimeter() {
        return Math.PI*2*radius;
    }

    @Override
    public String toString() {
        return String.format("Circle:color=%s, filled=%b, radius=%s, area=%s, perimeter=%s",
         getColor(), isFilled(), getRadius(), getArea(), getPerimeter());
    }
}

class Rectangle extends Shape{
    private double width;
    private double length;

    Rectangle(){};
    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        setColor(color);
        setFilled(filled);
    }
    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }
    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }
    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }
    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width + length);
    }
    public String toString(){
        return String.format("Rectangle:color=%s, filled=%b, width=%s, length=%s, area=%s, perimeter=%s",
        getColor(), isFilled(), getWidth(),getLength(), getArea(), getPerimeter());
    }
}

class Square extends Rectangle{
    private double side;

    Square(){};
    Square(double side){
        this.side = side;
    }
    Square(double side, String color, boolean filled){
        this.side = side;
        setColor(color);
        setFilled(filled);
    }
    /**
     * @return the side
     */
    public double getSide() {
        return side;
    }
    /**
     * @param side the side to set
     */
    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side){
        this.side = side;
    }
    public void setLength(double side){
        this.side = side;
    }
    public String toString(){
        return String.format("Square:color=%s, filled=%b, side=%s",
        getColor(), isFilled(), getSide());
    }
}