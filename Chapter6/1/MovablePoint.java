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
    public void moveUp() {

    }
    public void moveDown() {

    }
    public void moveLeft() {

    }
    public void moveRight() {

    }
}