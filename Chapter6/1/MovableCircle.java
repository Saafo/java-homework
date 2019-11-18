import MovablePoint;
public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius) {
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
        self.radius = radius;
    }
    public String toString() {
        return String.format("x=%d,y=%d,xSpeed=%d,ySpeed=%d,radius=%d.\n", center.x,center.y,center.xSpeed,center.ySpeed,radius);
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