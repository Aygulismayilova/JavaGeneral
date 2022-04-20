import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInputFromFiles {
    public static void main(String[] args) {
        // String fileName = "thing.txt";
        String fileName;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        try {
            System.out.println("Type the name of the file you want to input");
            fileName = br.readLine();
            FileInputStream fin = new FileInputStream(fileName);
            int fileInput;
            do {
                fileInput = fin.read();
                if (fileInput == -1) {
                    System.out.println("End of file");
                } else {
                    System.out.println((char) fileInput);
                }

            } while (fileInput != -1);
            fin.close();
            System.out.println("The file has been closed. Thanks you for using this program");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
