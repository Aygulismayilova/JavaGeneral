interface StringFI {
    String giveString(String a);
}

interface NumberFI {
    int newArray(int[] array);
}

public class LambdaBlock {
    public static void main(String[] args) {
        StringFI reverse = (String a) -> {
            String reversedString = "";
            for (int i = a.length() - 1; i >= 0; i--) {
                reversedString = reversedString + a.charAt(i);
            }
            return reversedString;
        };
        System.out.println(reverse.giveString("ice ice baby"));


        NumberFI sumFinder = (int[] array) -> {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];

            }
            return sum;
        };
        int[] numbers = {4, 6, 1, 2, 6};
        System.out.println(sumFinder.newArray(numbers));




    }
}
