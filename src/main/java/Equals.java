import java.util.Objects;

public class Equals {
    public static void main(String[] args) {
/*

        String name3 = new String("Rick");
        String name4 = new String("Dick");
        System.out.println(name3.equals(name4));
*/

        Person person1 = new Person("Aygul", 19);
        Person person2 = new Person("Aise", 19);
        System.out.println(person1.equals(person2));

        /*    int number1 = 8;
        int number2 = 3;
        int number3 = 8;
        System.out.println(number1 == number2);
        System.out.println(number1 == number3);
        String name1=new String("Aygul");
        String name2=new String("Aygul");
        String name3=name2;
        System.out.println(name1==name2);
        System.out.println(name2==name3);*/
        // System.out.println(name1.equals(name2));
        //==comparing values shallow compariospn
        //equals deep comparison testing if values and members of the object is the same. Obyektllerin valuesunu yoxlayir
        //equal objects must have equal hash codes
        //if you don't provide implementation yourself java will provide shallow comparison
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //POJO PlainOld Java Object
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}