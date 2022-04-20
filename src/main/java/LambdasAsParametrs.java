interface NumbersAreCool {
    int numberMethod(int num);
}

public class LambdasAsParametrs {
    static int randomMethod(NumbersAreCool a, int b) {
        return a.numberMethod(b);
    }

    public static void main(String[] args) {
        int num1;

        num1 = randomMethod((int a) -> {
            return a * 5;
        }, 4);
        System.out.println(num1);


        int num2;
        num2 = randomMethod((int a) -> {
            int result = 1;
            for (int i = 1; i <= a; i++) {
                result = result * i;
            }
            return result;
        }, 3);
        System.out.println(num2);

        NumbersAreCool squareRoot=(int a)->(int)Math.sqrt(a);
        int num3=randomMethod(squareRoot,49);
        System.out.println(num3);

    }
}
