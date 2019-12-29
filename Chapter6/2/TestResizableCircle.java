public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(6);
        System.out.println("radius: " + resizableCircle.getRadius());
        resizableCircle.resize(80);
        System.out.println("radius: " + resizableCircle.getRadius());
        System.out.println("area: " + resizableCircle.getArea());
        System.out.println("perimeter: " + resizableCircle.getPerimeter());
    }
}