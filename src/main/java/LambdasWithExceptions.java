interface NumbersFunction {
    int func(int[] array) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Array s empty");
    }
}

public class LambdasWithExceptions {
    public static void main(String[] args) throws EmptyArrayException {

        int[] numbers = {1, 5, 2, 60, 2000, 11, 54, 2};
        int[] numbers2 = {};
        NumbersFunction highestNum = (int[] a) -> {
            if (a.length == 0) {
                throw new EmptyArrayException();
            } else {
                int highestNumber = 1;
                for (int i = 0; i < a.length; i++) {
                    if (a[i] > highestNumber) {
                        highestNumber = a[i];

                    }
                }
                return highestNumber;

            }
        };
        System.out.println(highestNum.func(numbers));


    }
}
