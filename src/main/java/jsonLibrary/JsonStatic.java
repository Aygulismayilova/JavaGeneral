package jsonLibrary;

import mjson.Json;

public class JsonStatic {
    public static void main(String[] args) {
        Json passengers = Json.array("Aise", "Fatih", "Zamin", "Fatime", "Aygul");

        Json jsonObject = Json.object(
                "vehicleType", "car",
                "name", "Tesla Model X",
                "wheels", 4,
                "passengers", passengers,
                "isElectric", true);


        Json moreVehicleInfo = Json.object("speed", 10, "color", "purple");

        jsonObject.with(moreVehicleInfo);
        System.out.println(jsonObject);
passengers.with(Json.array("ana","ata","Sahil"));
        System.out.println(passengers);


        /*
        jsonObject.set("name", "BMW");
        jsonObject.set("isElectric", false);
        System.out.println(jsonObject);
jsonObject.delAt("passengers");
        System.out.println(jsonObject);
        passengers.set(4, "Ramile");
        System.out.println(passengers);
        passengers.add("Sahil");
        System.out.println(passengers);
        List<Object> names = passengers.asList();
        System.out.println(names.get(4));


        if (jsonObject.at("wheels").isNull()) {
            System.out.println("null");
        } else if (jsonObject.at("wheels").isNumber()) {
            System.out.println("it's a number");
        }


        Boolean isElectric = jsonObject.at("isElectric").asBoolean();
        System.out.println(isElectric);

        int wheels = jsonObject.at("wheels").asInteger();
        System.out.println(wheels);
        int nOfWheels = (int) jsonObject.at("wheels").getValue();
        System.out.println(nOfWheels);

        System.out.println(jsonObject);
        System.out.println(jsonObject.at("name"));
        System.out.println(passengers.at(2));
        System.out.println(jsonObject.at("wheels"));*/
    }


}
