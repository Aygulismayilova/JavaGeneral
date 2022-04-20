interface Thing<A> {
    A thingMethod(A a);
}


public class LambdaGenericFunctionalInterfaces {
    public static void main(String[] args) {
        Thing<String> reverse = (String s) -> {
            String reversedString = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                reversedString = reversedString + s.charAt(i);

            }
            return reversedString;
        };
        System.out.println(reverse.thingMethod("My name is Aygul"));

        Thing<Integer>findFactorial=(number)->{
            int result=1;
            for (int i=1;i<=number;i++){
                result=i*result;
            }
            return result;
        };
        System.out.println();
    }
}
