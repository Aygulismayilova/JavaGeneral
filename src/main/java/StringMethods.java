import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        //Finding substring
        String s1 = "Strings seem magical";
        System.out.println(s1.substring(8));

        //concatatenation
        String s2 = "death";
        String s3 = s2.concat("life ");
        System.out.println(s3);

        //Replacing character
        String s4 = "Hello".replace('H', 'w');
        System.out.println(s4);

        //removing extra spaces
        String s5 = "    Booty   ";
        System.out.println(s5.trim());


/*
        String s6="   Grape   ";
        System.out.println(s6.strip());
        's6.stripLeading
        s6.stripTrailing*/


        //Case changing
        String s7 = "car";
        String s8 = "ABRAKADABRA";
        System.out.println(s7.toUpperCase());
        System.out.println(s8.toLowerCase());


        String s9 = String.join("|", "I", "like", "Bear");
        System.out.println(s9);
        String s10=String.join("|",new Scanner(System.in).nextLine(),new Scanner(System.in).nextLine());
        System.out.println(s10);

/*
        click method and press control+Q to view documentation of that method
        ----List----
        substring() allows to you extract a string from a string
        concat() adds twostrings together
        replace() replaces all ocurences of character with a new character
        trim() will remove any extra space from string
        strip() - trim() removes extra space more up to date.
        stripLeading(), stripTrailing()
        toUpperCase makes everything uppercase
        toLowerCase makes everything lowercase
        join() cancatenates strings wiith a given delimiter
        */
    }
}
