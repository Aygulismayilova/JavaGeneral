package ReflectionBasics;

@EmptyAnnotation
public class AnnotatonBasics {
    private static final int THING = 3;

    @EmptyAnnotation
    public static void main(String[] args) {

    }

    @FilledAnnotation(value = 12, color = "blue")
    public static void doSomething() {
        System.out.println("hihiuhi");
    }
}
