import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random r = new Random(System.currentTimeMillis());
        System.out.println(r);
        r.ints().forEach(System.out::println);
      //  r.doubles(5).forEach(System.out::println);






/*
System.out.println(r.nextInt());
System.out.println(r.nextLong());
System.out.println(r.nextFloat());
System.out.println(r.nextInt(100));
*/


        /*Boolean b;
        for (int i=0;i<50;i++){
          b = r.nextBoolean();
            System.out.println(b);
        }
*/

    }
}
