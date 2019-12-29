public class TestShapes {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"blue",true);
        System.out.println("radius: " + circle.getRadius());
        System.out.println("area: " + circle.getArea());
        circle.setColor("yellow");
        System.out.println("yellow: " + circle.getColor());
        System.out.println("perimeter: " + circle.getPerimeter());
        System.out.println(circle.toString());
        System.out.println("----------------------");
        Rectangle rectangle = new Rectangle(2,3,"green",false);
        System.out.println("width: " + rectangle.getWidth());      
        System.out.println("length: " + rectangle.getLength()); 
        rectangle.setLength(7);
        System.out.println("length: " + rectangle.getLength());
        System.out.println(rectangle.toString()); 
        System.out.println("----------------------");
        Square square = new Square(4,"black",true);
        square.setSide(8);
        square.setFilled(false);
        square.setColor("gray");
        System.out.println("color: " + square.getColor());
        System.out.println("area: " + square.getArea());
        System.out.println(square.toString());
    }
}