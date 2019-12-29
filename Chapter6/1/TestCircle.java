public class TestCircle {
    public static void main(String[] args) {
        MovableCircle moveableCircle = new MovableCircle(2,4,1,3,5);
        System.out.println(moveableCircle.toString());
        moveableCircle.moveDown();
        moveableCircle.moveLeft();
    }
}