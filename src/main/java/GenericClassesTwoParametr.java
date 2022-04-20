class Flower<A, B> {
    A objectVariableOne;
    B objectVariableTwo;

    public Flower(A objectVariable1, B objectVariable2) {
        this.objectVariableOne = objectVariable1;
        this.objectVariableTwo = objectVariable2;
    }

    public A getObjectVariableOne() {
        return objectVariableOne;
    }

    public void setObjectVariableOne(A objectVariableOne) {
        this.objectVariableOne = objectVariableOne;
    }

    public B getObjectVariableTwo() {
        return objectVariableTwo;
    }

    public void setObjectVariableTwo(B objectVariableTwo) {
        this.objectVariableTwo = objectVariableTwo;
    }
}

public class GenericClassesTwoParametr {
    public static void main(String[] args) {

        Flower<String, Integer> flower1 =
                new Flower<String, Integer>("Aygul is cooll", 32);
        System.out.println(flower1.getObjectVariableOne());
        System.out.println(flower1.getObjectVariableTwo());
        flower1.setObjectVariableOne("wow");
        flower1.setObjectVariableTwo(22);
        System.out.println(flower1.getObjectVariableOne());
        System.out.println(flower1.getObjectVariableTwo());


    }
}
