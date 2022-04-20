package Collections;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Double> doubleAL = new ArrayList<>();
        doubleAL.add(2.0);
        doubleAL.add(4.0);
        doubleAL.add(213.3);
        System.out.println(doubleAL);
        Double[] doubles = new Double[doubleAL.size()];
        doubleAL.toArray(doubles);
        for (int i = 0; i < doubles.length; i++) {
            System.out.print(doubles[i] + " ");
        }

        //main difference between array and arraylist is that arraylist can be resized but array cannot be resized




   /*     //in arraylist you resize
        // arraylist stores objects, any datatype

        ArrayList<String> list = new ArrayList<>(4);
        System.out.println(list.size());
        list.add("vehicle");
        list.add("dolphin");
        list.add("jordan peterson");
        list.add("booty");
        list.add(1, "Aygul Ismayilova");
        System.out.println(list);
        System.out.println(list.size());
        list.remove(0);
        list.remove("dolphin");
        System.out.println(list);
        list.trimToSize();

        Arrays.asList(list);
*/
    }
}
