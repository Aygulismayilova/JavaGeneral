class Lifes<A extends Number> {
    A[] numberArray;

    public Lifes(A[] numberArray) {
        this.numberArray = numberArray;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < numberArray.length; i++) {
            sum = sum + numberArray[i].doubleValue();

        }
        return sum / numberArray.length;
    }
}


public class GenericsBoundedParametrs {
    public static void main(String[] args) {
        Integer[] nums = {1, 3, 5, 6};
        Double[] doubles = {1.4, 2.4, 1.2, 14214.1};
        //String[]strings={"kjk","djkdjk"};

        Lifes<Integer> life1 = new Lifes<>(nums);
        System.out.println(life1.average());

        Lifes<Double> life2 = new Lifes<>(doubles);
        System.out.println(life2.average());


       /* Lifes<String>lifes=new Lifes<String>(strings);
        System.out.println(lifes.average());
        Error:(32, 15) java: type argument java.lang.String is not within bounds of type-variable A*/

    }
}
