import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {
        //branching or selection statements which are part of control flow
        //If statements -a way to run code conditionally

        //anatomy of if statement
      /*  if (condition){
            //code will run if this condition evals to true
        }*/


        System.out.println("How old are you?");
        int myAge = 20;
        int requiredAge = 20;

        //single line if statement
        if (myAge < 18)
            if (myAge == 20) System.out.println("You are twenty");
            else System.out.println("You are nit twenty");
        if (myAge >= 18 && myAge < 70) System.out.println("You are an adult");
        else if (myAge >= 70) System.out.println("You are getting old");
        else System.out.println("You are still alive?");


        //nested if statement

        if (myAge < 18) {
            System.out.println("You are minor");
        } else if (myAge >= 18 && myAge < 70) {
            if (myAge == 20) {
                System.out.println("You are an adult that is twenty");
            } else {
                System.out.println("You are an adult");
            }
            System.out.println("You are an adult");
        } else if (myAge >= 70) {
            System.out.println("You are getting old");
        } else {
            System.out.println("You are still alive?");
        }


        if (myAge == 21) {
            System.out.println("Wow, you are really cool");
            ;
        }
        int myage2 = 2;
        //new Scanner(System.in).nextInt();


        if (myage2 >= 21) {
            System.out.println("You can enter");
        } else {
            System.out.println("You are not allowed");
        }

        if (myAge < 18) {
            System.out.println("You are minor");
        } else if (myAge >= 18 && myAge < 70) {
            System.out.println("You are an adult");
        } else if (myAge >= 70) {
            System.out.println("You are getting old");
        } else {
            System.out.println("You are still alive?");
        }
    }
}
