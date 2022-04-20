/*
class Autobox {
    static int n(Integer v) {
        return v;
    }
}
*/

public class WrapperTypes {
    public static void main(String[] args) {
Boolean b=true;
boolean b2=true;


if (b){
    System.out.println("autoinboxed");

}
Character char1='x';
char char2=char1;











       /* Integer int1, int2;
        int i;
        int1 = 100;
        System.out.println("Original value of int1 " + int1);

        ++int1;
        System.out.println("New value of int1 " + int1);


        int2 = int1 + int1 / 3;
        System.out.println("Value of int 2 " + int2);

        i = int1 + (int1 / 3);
        System.out.println(i);
        Integer int3=100;
        Double double1=98.6;
        double1=double1+int3;
        System.out.println(double1);

*/

/*
Integer int1=Autobox.n(100);
        System.out.println(int1);

*/


        //primitivi objecte cevirmek boxing
        //objecti primitive cevirmek unboxing
        //autoboxing

   /*     Integer int1=100;//autoboxing
        int i=int1; //auto unboxing
        System.out.println(int1+" "+i);

        //convert Object type to primitive type


        Integer iObj = Integer.valueOf(100);
        int kl = iObj.intValue();

        Integer integer=Integer.valueOf(iObj);
        System.out.println(integer);
        Byte b = Byte.MAX_VALUE;
        byte c = b.byteValue();
        System.out.println(i);
        System.out.println(b);


        try {
            Integer integer1 = new Integer("jkl");
            System.out.println(integer1);
        } catch (NumberFormatException n) {
            System.out.println(n);
        }
        Integer integer2 = Integer.valueOf(90);


        Character char1 = new Character('c');
        System.out.println(char1);

        Character char2 = Character.valueOf('c');
        System.out.println(char2);


        Boolean boolean1 = new Boolean("not true");
        System.out.println(boolean1);
        Boolean boolean2 = Boolean.valueOf("jkjkjk");
        Boolean boolean3 = Boolean.valueOf(true);
        System.out.println(boolean3);
    */
    }
}
