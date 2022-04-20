class Booty<ParamType> {
    ParamType variable;

    public void setVariable(ParamType variable) {
        this.variable = variable;
    }

    public ParamType getVariable() {
        return variable;
    }

    public Booty(ParamType variable) {
        this.variable = variable;
    }
}

class Cat {
    Object object;

    public Cat(Object objects) {
        this.object = objects;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}

public class Generics {
    public static void main(String[] args) {

        Booty<Integer> booty1 = new Booty<Integer>(45);
        booty1.setVariable(40);
        System.out.println(booty1.getVariable());

        Booty<String> booty2 = new Booty<>("This is cool.");
        booty2.setVariable("Wow");
        System.out.println(booty2.getVariable());
        int one = booty1.getVariable();//auto-unbox itself
        String two = booty2.getVariable();

        Cat kitty = new Cat(45);
        Cat kitty2 = new Cat("meow");
        String four = (String) kitty2.getObject();
        int three = (Integer) kitty.getObject();//cannot auto-unboxing

/*kitty=kitty2;
three=four;(error)*/
        //parametrized datatype
//we can give datdatype parametr

        /* generics allows you to use datatypes as a template
        so that you don't have to set a new method example for
        every time you are using a different datatype*/
        /*Instead of Object use generic type*/
//
//        Booty booty1=new Booty();
//        booty1.setVariable(45);
//        booty1.setVariable("hkjhkh");
//        System.out.println(booty1.variable);


    }
}
