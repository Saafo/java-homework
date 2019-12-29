package 1;
public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    
    public MovablePoint(int x,int y,int xSpeed,int ySpeed){
        self.x = x;
        self.y = y;
        self.xSpeed = xSpeed;
        self.ySpeed = ySpeed;
    }
    public String toString() {
        return String.format("x=%d,y=%d,xSpeed=%d,ySpeed=%d.\n", x,y,xSpeed,ySpeed);
    }
    public void moveUp(int d) {
        center.y += d;
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