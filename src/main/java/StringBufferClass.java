public class StringBufferClass {
    public static void main(String[] args) {
        //Stringbuffer can be changed a lot
        //Stringbuffer can preserve characters and plus double space.
        //if you want to add  characters more than space reserved,you have to reallocate.

        

        StringBuffer s = new StringBuffer("Dolphin");
        s.replace(0,3,"dodododo");
        System.out.println(s);
        s.delete(2, 6);
        s.delete(2, 3);//s.insert(2, "love ");
        System.out.println(s);
        s.reverse();
        System.out.println(s);

/*

        StringBuffer s = new StringBuffer("Shapiro");
        s.append("Ben").append(30).append(90);
        System.out.println(s);
        System.out.println(s.charAt(3));
        s.setCharAt(3, 'k');
        System.out.println(s);
*/






       /* StringBuffer s = new StringBuffer("Republicans are #1");
        System.out.println(s);
        System.out.println(s.length());
        s.setLength(16);
        System.out.println(s);
*/



/*


        StringBuffer s1 = new StringBuffer(5);
        System.out.println(s1.capacity());
        StringBuffer s2 = new StringBuffer("I'm a string");
        System.out.println(s2.length());
        System.out.println(s2.capacity());
        StringBuffer s3 = new StringBuffer(30);
        System.out.println(s3);
        s1.append("helllllo");
        System.out.println(s1);
*/


        // -List
        /*
        length()- how many characters are in a string
        capacity() how much total space has been reserved for characters
        including length
        setLength()set the maximum amount of allowed length
        setCharAt() replace a single character
        append() adds a strng onto the end of stringbuffer
        insert() put a string before a provided index
        reverse() - reverses a stringbuffer character by character
        deleteCharAt() delete a single character
        replace() replace a substring with a a new one
        StringBuffer is thread a safe- it  can be used many threads at once.
        StringBuilder is not thread safe


                */





       /* StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello");
        stringBuffer.append("My name is Aygul. What is your name?");*/
    }
}
