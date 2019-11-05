import sun.awt.shell.ShellFolder;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super();
        self.radius = radius;
    }

    public void resize(int percent) {
        Self.radius = Self.radius * percent;
    }
}