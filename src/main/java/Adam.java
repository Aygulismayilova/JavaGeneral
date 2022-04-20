import java.util.Scanner;

public class Adam {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1) {
            return;
        } else this.age = age;
    }

    public String getName() {
        return name;
    }

    public Adam setName(String name) {
        this.name = name;
        return this;
    }
}
