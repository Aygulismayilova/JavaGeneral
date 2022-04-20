package ReflectionBasics;

import org.reflections.Reflections;
import org.reflections.scanners.FieldAnnotationsScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Set;
import java.lang.annotation.*;

public class MainFoodService {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Reflections reflections = new Reflections(
                new ConfigurationBuilder()
                        .setUrls(ClasspathHelper.forPackage("ReflectionBasics"))
                        .setScanners(new FieldAnnotationsScanner()));
        Set<Field> fields = reflections.getFieldsAnnotatedWith(Wire.class);
        FoodController foodController = new FoodController();

        for (Field field : fields) {
            Class typeClass = field.getType();
            Constructor constructor = typeClass.getConstructor();
            Object object = constructor.newInstance();
            System.out.println(object);
            field.setAccessible(true);
            field.set(foodController, object);
        }

            foodController.handleCooking();
    }
}
