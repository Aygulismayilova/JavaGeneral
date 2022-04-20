public class StringComparionAndSearchMethods {
    public static void main(String[] args) {
        String bob = "Larry the bobson";
        System.out.println(bob.indexOf("the"));

        System.out.println(bob.lastIndexOf('r'));


        String[] arr = {
                "If", "I", "like", "booty", "then", "a", "booty", "will", "like", "me"
        };
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i].compareToIgnoreCase(arr[j]) < 0) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;

                }
            }
            System.out.println(arr[j]);
        }

       /* String s1="Bob";
        String s2="an";
        System.out.println(s1.compareTo(s2));//-17*/
        //If the result is negative integer
        //it means the first string comes before in dictionary than the second string





 /*       String b1 = "hello";
        String b2 = new String(b1);
        String b3="hello";

        System.out.println(b1.equals(b2));//true
        System.out.println(b1==b2);//false
        System.out.println(b1==b3);//true*/





        /*
        String random="pickleblaster";
        System.out.println(random.startsWith("ickle",1));
        System.out.println(random.endsWith("blaster"));*/
  /*      String s5 = "Elephante";
        String s6 = "Cow";
        String s7 = "ELEPHANTE";
        System.out.println(s5.regionMatches(3, s6, 0, 3));
        System.out.println(s5.regionMatches(3, s7, 3, 6));
        System.out.println(s5.regionMatches(true,3, s7, 3, 6));


*/

     /*
        String s1 = "Bob";
        String s2 = "Susan";
        String s3 = "Susan";
        String s4 = "BOB";
        //same character,case

        System.out.println(s1 + " = " + s2 + "->" + s1.equals(s2));
        System.out.println(s2 + " = " + s2 + "->" + s2.equals(s3));
        System.out.println(s1 + " = " + s4 + "->" + s1.equals(s4));
        System.out.println(s1 + " = " + s4 + "->" + s1.equalsIgnoreCase(s4));
        //*/
        //equals checks to see if the characters of two strings are equal
        //equalsIgnoreCase same thing but ignores case of characters
        //regionmatches compares specific region of two strings
        //starts with determines wheter a given string begins with a specific string
        //end with checks to see if the endings match
        //compareto and comparetoignorecase compares two strings based on their lexicographical Order
        //indexof searches for the first occurence of the chatracter or substring
        //lastindex searches for the last occurence of the character or substrrng
    }
}
