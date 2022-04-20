package ReflectionBasics;

public class Dog {
    private String name;
    private int age;
    public String test;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
        this.name = "Bob";
        this.age = 2;
    }

    private void kill() {
        System.out.println("kill");
    }

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
}
