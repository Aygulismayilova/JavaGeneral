package Collections;

import java.util.*;

public class Iterartors {
    //Iterator and list iterator
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Zamin");
        names.add("Fatime");
        names.add("Aygul");
        names.add("Aise");
        names.add("Fatih");
        Iterator<String> nameIterator = names.iterator();
       /* System.out.println("Here's all of names ");
        while (nameIterator.hasNext()) {
            System.out.println(nameIterator.next());
        }*/
        ListIterator<String> it = names.listIterator();
        System.out.println("Names: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        System.out.println("Names backwords: ");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }




        HashMap<String, String> map = new HashMap<>();
        map.put("keys1", "value1");
        map.put("keys2", "value2");
        map.put("keys3", "value3");


        Iterator<Map.Entry<String, String>> its = map.entrySet().iterator();
        while (its.hasNext()) {
            Map.Entry<String, String> pair = its.next();
            System.out.println(pair.getKey()+" "+pair.getValue());
        }

    }
}
