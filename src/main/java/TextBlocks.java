public class TextBlocks {
    //JDK 15 feature
    public static void main(String[] args) {
//JDK 15 formatted method on String



       String word="Bob";
        System.out.println("""
                This is formatted string %s""".formatted(word));
        System.out.printf("""
                This is a word: %s
                """,word);
        System.out.printf("");
        String line="My name is       \s\"Aygul\"";
        String textBlock= """
                My name is "Aygul".
                """;
        textBlock= """
                name is \"""AYGUL\"""    \s
               """;
        System.out.println(line);
        System.out.println(textBlock);

        String paragraph = "I am a line\n" + "I am a line\nI am newly created line";
        System.out.println(paragraph);
        paragraph = """
                My name is Aygul.
                I am from Azerbaijan.
                I am java developer""";

        System.out.println(paragraph);
        String jsonString = "{" +
                "\"name\": \"Aygul Ismail\"," +
                "\"age\": 24," +
                "\"address\":" +
                "\"isCool\": true" +
                "}";
        System.out.println(jsonString);
        jsonString = """
                {
                "name":"Aygul Ismail", "age":"24"
                 "address":
                 "isCool":true
                 {
                 """;
        System.out.println(jsonString);

        String html="<html>\n" +
                "<body>\n" +
                "\n" +
                "<h1>Heading 1</h1>\n" +
                "<h2>Heading 2</h2>\n" +
                "<h3>Heading 3</h3>\n" +
                "<h4>Heading 4</h4>\n" +
                "<h5>Heading 5</h5>\n" +
                "<h6>Heading 6</h6>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
        System.out.println(html);
        html=   """
                <html>
                <body>
                   
                  <h2>The href Attribute</h2>
                   
                   <p>HTML links are defined with the a tag. The link address is specified in the href attribute:</p>
                    <a href="https://www.w3schools.com">Visit W3Schools</a>
                   
                </body>
                </html>  
        """;
        System.out.println(html);





    }
}
