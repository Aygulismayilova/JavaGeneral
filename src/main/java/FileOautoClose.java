import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOautoClose {
    public static void main(String[] args) {
        int input;
        try (FileInputStream fin = new FileInputStream("aygul.txt");
             FileOutputStream fis = new FileOutputStream("aygul.txt")) {

            do {

                input = fin.read();
                System.out.println((char) input);


            } while (input != -1);

        } catch (IOException e) {
            System.out.println(e);

        }
    }
/*    int input;
        try {
        FileInputStream fin = new FileInputStream("aygul.txt");
        do {
            input = fin.read();
            System.out.println((char) input);

        } while (input != -1);
            fin.close();


    } catch (IOException e) {
        System.out.println(e);
    }*/
}
