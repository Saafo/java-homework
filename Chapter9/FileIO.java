import java.io.*;
public class FileIO {
    public static String fileRead(String Filelocation) throws IOException {
        File file = new File(Filelocation);
        if (file.exists()) {
            if (file.canRead()) {
                String s;
                StringBuilder builder = new StringBuilder();
                int i;
                // InputStream fin = new FileInputStream("./rawdata.txt");
                // InputStream bin = new BufferedInputStream(file);
                Reader reader = new FileReader("./rawdata.txt");
                while ((i = reader.read()) != -1) {
                    builder.append(String.valueOf((char) i));
                }
                s = builder.toString();
                System.out.println("The file length is: " + s.length());
                System.out.println("The file contents are:");
                System.out.println(s);
                reader.close();
                return s;
            }
        }
        return null;
    }
    public static int fileWrite(String Content, String FileLocation) throws IOException {
        File file = new File(FileLocation);
        if(!file.exists()) {
            file.createNewFile();
        }
        if(file.canRead()) {
            Writer writer = new FileWriter(FileLocation);
            writer.write(Content);
            writer.close();
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) throws IOException {
        String FileContent = new String();
        FileContent = fileRead("./rawdata.txt");
        if(FileContent != null)
            System.out.println("Successfully read file contents");
        if(fileWrite(FileContent, "./output.txt") == 0)
            System.out.println("Successfully wrote './output.txt' file.");
    }
}