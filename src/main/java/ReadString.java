import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadString {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String string[] = new String[10];
        System.out.println("Type as many lines of text as you want. Press enter as you want");
        System.out.println("Type stop to stop");
        try {
            for (int i = 0; i < 100; i++) {
                string[i] = br.readLine();
                if (string[i].equalsIgnoreCase("stop")) {
                    break;
                }
            }

            System.out.println("------------");
            System.out.println("More is all of your stored output");
            for (int i = 0; i < 100; i++) {
                if (string[i].equalsIgnoreCase("stop")) {
                    break;
                }
                System.out.println(string[i]);
            }


        } catch (IOException e) {
            System.out.println(e);

        }
        System.out.println("We are done gathering input. Thanks for using the program.");


      /*  InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String string;
        System.out.println("Type as many lines of text as you want. Press enter as you want");
        System.out.println("Type stop to stop");
        try {
            do {
                string = br.readLine();
                System.out.println(string);
            } while (!string.equalsIgnoreCase("stop"));

        } catch (IOException e) {
            System.out.println(e);

        }
        System.out.println("We are done gathering input. Thanks for using the program.");
    */
    }
}
