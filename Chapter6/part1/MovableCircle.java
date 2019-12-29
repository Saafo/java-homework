//import MovablePoint;
package 1;
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
    public void moveUp(int d) {
        center.y += center;
        System.out.printf("Moved up by %d, the center now is at (%d , %d).\n",d,center.x,center.y);
    }
    public void moveDown(int d) {
        center.y -= d;
        System.out.printf("Moved down by %d, the center now is at (%d , %d).\n",d,center.x,center.y);
    }
    public void moveLeft(int d) {
        center.x -= d;
        System.out.printf("Moved left by %d, the center now is at (%d , %d).\n",d,center.x,center.y);
    }
    public void moveRight(int d) {
        center.x += d;
        System.out.printf("Moved right by %d, the center now is at (%d , %d).\n",d,center.x,center.y);
    }
}