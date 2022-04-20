package ReflectionBasics;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainLlama {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class llamaClass = Llama.class;
        Constructor constructor = llamaClass.getConstructor(String.class, int.class, String.class, boolean.class);
        Llama llama = (Llama) constructor.newInstance("bob", 2, "red", true);
        System.out.println(llama);

        Method method = llamaClass.getMethod("spit");
        method.invoke(llama);

        //private methods
        Method pMethod = llamaClass.getDeclaredMethod("fart");
        pMethod.setAccessible(true);
        pMethod.invoke(llama);


        //dynamic methods invoking
        Method[] methods = llamaClass.getDeclaredMethods();
        for (Method method1 : methods) {
            if (method1.getParameterCount() == 0) {
                method1.setAccessible(true);
                System.out.println(method1.invoke(llama));
            }
        }
        //to change values of field

        System.out.println(llama);
        Field eyeField = llamaClass.getDeclaredField("eyeCount");
        eyeField.setAccessible(true);
        eyeField.set(llama, 30);
        System.out.println(llama);
    }
}
