package jsonLibrary;

import mjson.Json;

import java.util.ArrayList;
import java.util.HashMap;

public class JsonClass {
    public static void main(String[] args) {
        HashMap<String, Boolean> names = new HashMap<>();
        names.put("Aygul", true);
        names.put("Had highly paid job", true);
        names.put("lives in Baku", false);
        names.put("has 4 happy children", true);

        Json object3 = Json.make(names);
        System.out.println(object3);


        ArrayList<String> strings = new ArrayList<>();
        strings.add("Aygul");
        strings.add("Ismayilova");
        strings.add("is");
        strings.add("senior backend java developer");
        Json object2 = Json.make(strings);
        System.out.println(object2);


        Json object = Json.make(45);
        System.out.println(object);


        Json array = Json.array(67, 78, 45, "Aygul", true);

        System.out.println(array);


        String jsonString1 = "[45,21,\"booty\",false]";
        Json jsonObject1 = Json.read(jsonString1);
        System.out.println(jsonObject1);


        String jsonString = "{" +
                "\"name\": \"Aygul Ismail\"," +
                "\"age\": 24," +
                "\"address\":" +
                "{" +
                "\"streetAddress\": \"Guanara Astras 8k\"," +
                "\"city\": \"Riga\"," +
                "\"state\": \"Latvija\"," +
                "\"zipcode\": 75000" +
                "}," +
                "\"iscool\": true" +
                "}";
        Json jsonObject = Json.read(jsonString);
        System.out.println(jsonObject);
    }

/*  "name": "Aygul Ismail",
  "age": "24",
  "address": {
    "streetAddress": "Guanara Astras 8k",
    "city": "Riga",
    "state": "Latvija",
    "zipcode": 75000
  },
  "iscool": true*/


}
