import java.io.FileReader; 
import java.io.FileWriter; 
import java.io.BufferedReader; 
import java.io.BufferedWriter; 
import java.io.IOException;

public class CopyCharactersBuffered {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        BufferedWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("canto.txt"));
            outputStream = new BufferedWriter(new FileWriter("characteroutput.txt"));

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
