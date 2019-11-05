public class MovableCircle extends MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius) {
        self.x = x;
        self.y = y;
        self.xSpeed = xSpeed;
        self.ySpeed = ySpeed;
        self.radius = radius;
    }
    public String toString() {
        return String.format("x=%d,y=%d,xSpeed=%d,ySpeed=%d,radius=%d.\n", x,y,xSpeed,ySpeed,radius);
    }
    public void moveUp() {
        //人晕了 这写啥啊 难道是：
        System.out.println("Moved up.\n");
    }
    public void moveDown() {
        System.out.println("Moved down.\n");
    }
    public void moveLeft() {
        System.out.println("Moved left.\n");
    }
    public void moveRight() {
        System.out.println("Moved right.\n");
    }
}