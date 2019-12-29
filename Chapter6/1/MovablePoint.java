public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    
    public MovablePoint(int x,int y,int xSpeed,int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString() {
        return String.format("x=%d,y=%d,xSpeed=%d,ySpeed=%d.\n", this.x,this.y,this.xSpeed,this.ySpeed);
    }
    public void moveUp() {
        this.y += ySpeed;
        System.out.printf("Moved up by %d, the center now is at (%d , %d).\n",this.ySpeed,this.x,this.y);
    }
    public void moveDown() {
        this.y -= ySpeed;
        System.out.printf("Moved down by %d, the center now is at (%d , %d).\n",this.ySpeed,this.x,this.y);
    }
    public void moveLeft() {
        this.x -= xSpeed;
        System.out.printf("Moved left by %d, the center now is at (%d , %d).\n",this.xSpeed,this.x,this.y);
    }
    public void moveRight() {
        this.x += xSpeed;
        System.out.printf("Moved right by %d, the center now is at (%d , %d).\n",this.xSpeed,this.x,this.y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
}