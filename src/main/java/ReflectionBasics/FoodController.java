package ReflectionBasics;

import java.lang.reflect.Field;

public class FoodController {


    @Wire
    private FoodService foodService;
    public void handleCooking() {
        foodService.cookFood();
    }

}
