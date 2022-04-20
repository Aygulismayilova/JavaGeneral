class NonGenericClass {
    static <ArrayParam extends Number> double findHighestNumber(ArrayParam[] ourArray) {
        double highestNumber = 0.0;
        for (int i = 0; i < ourArray.length; i++) {
            if (ourArray[i].doubleValue() > highestNumber) {
                highestNumber = ourArray[i].doubleValue();
            }

        }
        return highestNumber;
    }
}
class NonGenericClass2{
    double value;

    <A extends Number> NonGenericClass2(A number) {
        this.value = number.doubleValue();
    }
    public  double getValue(){
        return value;
    }

}

public class GenericMethodsAndConstructors {
    public static void main(String[] args) {
        int number=10;
        NonGenericClass2 test=new NonGenericClass2(number);
        System.out.println(test.getValue());





        //regular class with generic methods
        Integer[] numbers = {1, 60, 20, 1};
        Double[]numbers2={3.0,2.3,1.0,90.0};
        String[]strings={"ksj","sbs"};
        System.out.println(NonGenericClass.findHighestNumber(numbers));
        System.out.println(NonGenericClass.findHighestNumber(numbers2));
       // System.out.println(NonGenericClass.findHighestNumber(strings));
    }
}