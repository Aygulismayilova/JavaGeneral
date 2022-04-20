public class StringCharacterExtraction {
    public static void main(String[] args) {


        String s2 = "I am a long string";
        char[]charArray=s2.toCharArray();
        System.out.println(charArray);

        byte[]bytes=s2.getBytes();
        System.out.println(new String(bytes));

      /*  char[] chars = new char[10];
        s2.getChars(0, 9, chars, 0);

        System.out.println(chars);
        String s1 = "Larry";
        char letter = s1.charAt(4);
        System.out.println(letter);

*/
        //charAt gets a single character at a given index
        //gets multiple chars from string object
        //getBytes() gets a byte array from a string object
        //s2.toCharArray() gets a char array from a String objectl
    }
}
