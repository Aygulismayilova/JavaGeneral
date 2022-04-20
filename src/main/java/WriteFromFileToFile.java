import java.io.*;

public class WriteFromFileToFile {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("booty.txt");
            FileInputStream fin = new FileInputStream("lyrics.txt");
            int input;
            do {
                input = fin.read();
                if (input == -1) {
                    System.out.println("End of file. Done Coping the old file");
                } else {
                    fout.write(input);
                }
            } while (input != -1);
            System.out.println("Would you like to add some more stuff to file?");
            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ir);
            String yesOrNo = br.readLine();
            if (yesOrNo.equalsIgnoreCase("yes")) {
                do{
                    input=br.read();
                    fout.write(input);
                }while (input!='x');
            }
            System.out.println("Program done running");
            fin.close();
            fout.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
