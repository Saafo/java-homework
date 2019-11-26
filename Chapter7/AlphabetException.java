import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class NonAlphabetException extends Exception{
    String ExceptionInfo;
    NonAlphabetException(String s) {
        ExceptionInfo = s;
    }
}

public class AlphabetException {
    AlphabetException(String input) {
        try {
            for(int i = 0;i < input.length(); i++) {
                if(!Character.isAlphabetic(input.charAt(i)))
                    throw new NonAlphabetException("Detected non-alphabet character at index: " + i);
            }
            System.out.println("Total character: " + input.length());
        } catch (NonAlphabetException e) {
            System.out.println(e.ExceptionInfo);
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        AlphabetException test = new AlphabetException(bufferedReader.readLine());//System.in.toString());
        bufferedReader.close();
    }
}