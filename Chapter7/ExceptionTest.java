import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyException extends Exception{
    MyException(String s) {
        System.out.println(s);
    }
}

public class ExceptionTest{
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String StringRead = bufferedReader.readLine();
            int len = StringRead.length();
            for(int i = 0; i < len; i++){
                if(StringRead.charAt(i) > 'z' || StringRead.charAt(i) < 'A'){
                    throw new MyException("Detected error in index: " + i);
                }
            }
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}