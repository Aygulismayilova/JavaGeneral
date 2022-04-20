package ReflectionBasics;

public @interface FilledAnnotation {
    String name() default "bob";

    int value() default 89;
    String color();

}
