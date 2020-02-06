import java.io.*;
import java.net.*;
import java.util.*;

public class LANChatServer {
    ArrayList clientOutputStreams;

    public class ClientHandler implements Runnable {
        BufferedReader reader;
        Socket sock;

        public ClientHandler(Socket clientSocket) {
            try {
                sock = clientSocket;
                InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
                reader = new BufferedReader(isReader);
            } catch(Exception ex) {ex.printStackTrace();}
        }

        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("recv: " + message);
                    tellEveryone(message);
                }
            } catch(Exception ex) {ex.printStackTrace();}
        }
    }


    public static void main(String[] args) {
        new LANChatServer().go();
    }

    public void go() {
        clientOutputStreams = new ArrayList<>();
        try(ServerSocket serverSock = new ServerSocket(4999)) {

            while(true) {
                Socket clientSocket = serverSock.accept();
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                clientOutputStreams.add(writer);

                Thread t = new Thread(new ClientHandler(clientSocket));
                t.start();
                System.out.printf("got a connection, forward to port %d\n",clientSocket.getPort());
            }
        } catch (Exception ex) {ex.printStackTrace();}
    }

    public void tellEveryone(String message) {
        Iterator it = clientOutputStreams.iterator();
        while(it.hasNext()) {
            try {
                PrintWriter writer = (PrintWriter) it.next();
                writer.println(message);
                writer.flush();
            } catch(Exception ex){ex.printStackTrace();}
        }
    }
}