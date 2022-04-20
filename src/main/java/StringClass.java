class Cow {
    int milk;
    int utters;

    Cow(int milk, int utters) {
        this.milk = milk;
        this.utters = utters;

    }

    public String toString(){
        return "(MOO) Milk: " + milk + ",  Utters: " + utters;
    }
}

public class StringClass {
    public static void main(String[] args) {

        Cow cow1 = new Cow(213, 123);
        System.out.println(cow1.toString());


        String bob = "bob";
        int age = 10;
        String sentence = bob + " is " + age + " years old";
        System.out.println(sentence);
        String potato = "Twenty two: " + (2 + 2);
        String tomato = 2 + 2 + "";
        System.out.println(potato);

        System.out.println(tomato);
/*
char[] letters = {'l', 'i', 'v', 'e'};

String charString = new String(letters, 1, 3);
System.out.println(charString);


byte[] letters2 = {66, 67, 68, 69, 70};
String byteString = new String(letters2, 0, 5);
System.out.println(byteString);

String bob = new String("ioo");//ctrl+p
String bob2 = "ioo";
String bob4 = "ioo";
String bob3 = new String("ioo");//character arrays


String a = "jk";//String literal
String b = "jk";
String c = "jk";

*/

/*
String bob = "Aygul";
//String bob is an object,immutable object
bob = new String("89");
System.out.println(bob);
//Stringbuilder and stringbuffer can change, they are mutuable objects

String string1 = "abcd";
String string2 = "abcd";
System.out.println(string1 == string2);
*/


    }
}
