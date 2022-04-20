public class TernaryOperator {
    public static void main(String[] args) {
        // int message;
        //        if (true) message = "Hello World";
        //        else System.out.println("Goodbye");

        //1. condition
        //2.expression or value to be returned if true
        //3.expression or value to be returned if false
       /* message = (true) ? 1 + 1 : 4;
        System.out.println(message);*/

        int points=60;
        String message=points>50?"You are champion!":"";
        System.out.println(message);






       /* int points = 69;
        boolean wonGame = false;
        if (wonGame) {
            System.out.println("The game has finished! You won " + points + " points");
        } else System.out.println("The game has finished! You lost with " + points + " points");
        System.out.println("The game has finished! You " + (wonGame ? "won" : "lost") + " with " + points + " points");
 */









    }
}
