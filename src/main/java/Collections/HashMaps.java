package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        //Hashmaps stores pairs
        //key-value pair
        HashMap<String, Long> phoneNumbers = new HashMap<>();
        phoneNumbers.put("Bob", 89890980l);
        phoneNumbers.put("Roby", 89080808l);
        phoneNumbers.put("Aygul", 909090l);
        System.out.println(phoneNumbers.get("Bob"));

        //System.out.println(phoneNumbers.keySet());
        System.out.println(phoneNumbers.get("Aygul"));
        phoneNumbers.put("Aygul", 8989l);
        System.out.println(phoneNumbers.get("Aygul"));
        phoneNumbers.remove("Bob");
        for (Map.Entry<String, Long> set : phoneNumbers.entrySet()) {
            System.out.println(set.getKey() + " " + set.getValue());
        }


    }


}
