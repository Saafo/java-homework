public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
        this.radius = radius;
    }
    public String toString() {
        return String.format("x=%d,y=%d,xSpeed=%d,ySpeed=%d,radius=%d.\n", center.x,center.y,center.xSpeed,center.ySpeed,radius);
    }
    public void moveUp() {
        center.y += center.ySpeed;
        System.out.printf("Moved up by %d, the center now is at (%d , %d).\n",center.ySpeed,center.x,center.y);
    }
    public void moveDown() {
        center.y -= center.ySpeed;
        System.out.printf("Moved down by %d, the center now is at (%d , %d).\n",center.ySpeed,center.x,center.y);
    }
    public void moveLeft() {
        center.x -= center.xSpeed;
        System.out.printf("Moved left by %d, the center now is at (%d , %d).\n",center.xSpeed,center.x,center.y);
    }
    public void moveRight() {
        center.x += center.xSpeed;
        System.out.printf("Moved right by %d, the center now is at (%d , %d).\n",center.xSpeed,center.x,center.y);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }
}