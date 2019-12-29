import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LANChatClient {
    JTextArea ReceivedMessageArea;
    JTextField MessageToBeSentField;
    BufferedReader reader;
    PrintWriter writer;
    Socket sock;
    String LastSentMessage;

    public static void main(String[] args) {
        LANChatClient client = new LANChatClient();
        client.go();
    }

    public void go() {
        JFrame frame = new JFrame("LAN Chat Client");
        JPanel mainPanel = new JPanel();
        ReceivedMessageArea = new JTextArea(15,30);
        ReceivedMessageArea.setLineWrap(true);
        ReceivedMessageArea.setWrapStyleWord(true);
        ReceivedMessageArea.setEditable(false);
        JScrollPane scroller = new JScrollPane(ReceivedMessageArea);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        MessageToBeSentField = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(scroller);
        mainPanel.add(MessageToBeSentField);
        mainPanel.add(sendButton);
        setUpNetworking();

        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(400, 310);
        frame.setVisible(true);
    }//关闭go

    private void setUpNetworking() {
        try {
            sock = new Socket("127.0.0.1",4999);
            InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
            reader = new BufferedReader(streamReader);
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("networking established");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public class SendButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            try {
                writer.println(MessageToBeSentField.getText());
                writer.flush();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            ReceivedMessageArea.append("sent: " + MessageToBeSentField.getText() + "\n");
            LastSentMessage = MessageToBeSentField.getText();
            MessageToBeSentField.setText("");
            MessageToBeSentField.requestFocus();
        }
    }

    public class IncomingReader implements Runnable {
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    Thread.sleep(100);
                    if(!message.equals(LastSentMessage)) {
                        System.out.println("recv: " + message);
                        ReceivedMessageArea.append("recv: " + message + "\n");
                    }
                }
            } catch (Exception ex) {ex.printStackTrace();}
        }//close run
    }//close inner class
}
