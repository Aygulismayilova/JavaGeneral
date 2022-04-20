package ReflectionBasics;

import java.lang.reflect.*;
import java.util.Arrays;

public class Reflection1 {
    public static void main(String[] args) {

      /*  Class dogClass = Dog.class;
        System.out.println(dogClass.getName());
        System.out.println(dogClass.getClass());*/

        Dog dog = new Dog("Bozdar", 4);
        Class dogClass = dog.getClass();
        System.out.println("Class name " + dogClass.getName());
        System.out.println("Interface? " + dogClass.isInterface());
        System.out.println("Array? " + dogClass.isArray());
        System.out.println("\n Constructors:");
        Constructor[] constructors = dogClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Constructor name " + constructor.getName());
            System.out.println("----params----");
            if (constructor.getParameterCount() == 0) {
                System.out.println("no arg constructor");
            } else {
                Parameter[] parameters = constructor.getParameters();
                for (Parameter parameter : parameters) {
                    System.out.println(parameter.getName() + " : " + parameter.getType());
                }
            }
        }
        Method[] methods = dogClass.getMethods();
        for (int i = 0; i < methods.length; i++) {

            //  System.out.println("Method number "+(i+1)+" " +methods[i].getName());
            System.out.println("Method number " + (i + 1)+" " + Modifier.toString(methods[i].getModifiers()) + " " + methods[i].getReturnType().getName() + " " +
                    methods[i].getName() + " - " + Arrays.toString(methods[i].getParameters()));

        }
        System.out.println("  --------   ");
        Method[]declaredMethods=dogClass.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {

            //  System.out.println("Method number "+(i+1)+" " +methods[i].getName());
            System.out.println("Method number " + (i + 1)+" " + Modifier.toString(declaredMethods[i].getModifiers()) + " " +
                    "" + declaredMethods[i].getReturnType().getName() + " " +
                    declaredMethods[i].getName() + " - " + Arrays.toString(declaredMethods[i].getParameters()));

        }
        System.out.println("fields");
        Field []fields=dogClass.getDeclaredFields();
        for (Field field:fields){
            System.out.println(Modifier.toString(field.getModifiers())
                    +" "+field.getType().getName() +" "+field.getName());
        }
        //Reflection enables you acces to al private members and code of class
        /*   Class c1 = int.class;
        System.out.println(c1.getName());


        Class c2 = long.class;
        Class c3 = void.class;
        Class c4 = double.class;
        System.out.println(c2.getName());
        System.out.println(c3.getName());
        System.out.println(c4.getName());*/
    }
}
/*Reflection alows you to grab information within the program using the code

 * */