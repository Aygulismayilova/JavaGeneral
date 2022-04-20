interface FunctionalInterface2 {
    int func(int a);
}

public class EffectivelyFinal {
    public static void main(String[] args) {
        int thing = 89;

        FunctionalInterface2 ez = (int a) -> {
            int result;
            result = thing;
            return result;
        };
        System.out.println(ez.func(90));
        System.out.println((ez.func(78)));

//lambdadan kenarda elan olunmus expressioni lambdanin icerisinde isledende effectivel
        //finala cevirir ve deyerini deyismek olmur
    }
}
