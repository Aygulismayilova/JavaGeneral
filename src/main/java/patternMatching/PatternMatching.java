package patternMatching;

public class PatternMatching {
    public static void main(String[] args) {
        String thing = "I enjoy eating cheese";
        Object obj = thing;
        if (obj instanceof String) {
            String string = (String) obj;
            System.out.println("String: " + string);
        }

        //DK 16 instance of pattern matching
        //"string is known as the "pattern variable"
        //A pattern variable is in scope where it has definitely matched


        if (obj instanceof String string) {
            System.out.println("String " + string);
        }

    }
}
