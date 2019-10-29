import java.awt.*;
import java.awt.event.*;
class HelloGUI{
    public static void main(String args[]){
        Frame frame = new Frame("MyGUIApp");
        Button button = new Button("Click me...");
        button.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    button.setLabel("Hello~~");
                }
            }
        );
        frame.add(button);
        frame.pack();
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
