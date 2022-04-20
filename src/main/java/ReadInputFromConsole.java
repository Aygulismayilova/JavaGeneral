import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInputFromConsole {
    public static void main(String[] args) {
//usually input data with byte atream but new way is to use character stream
        //BufferedReader
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
char input;
      try{
          do {
              input=(char)br.read();
              System.out.print(input);
          }
          while (input!='x');
      }catch (IOException e){
          System.out.println(e
          );
      }



        /*char input;
        try {
            input = (char)br.read();
            System.out.println(input);
        } catch (IOException e) {
            System.out.println(e);
        }*/


    }
}
