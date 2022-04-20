import classes.Child;
import classes.Parent;

import java.util.Arrays;

public class MainForSealedClasses {
    public static void main(String[] args) {
         //Reflection API
        Parent parent=new Child();
        if (parent.getClass().isSealed()){
            System.out.println("Permitted subclasses: "+ Arrays.toString(parent.getClass().getPermittedSubclasses()));
        }else
            System.out.println("This isn't sealed class.");
    }
}
