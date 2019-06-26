import java.util.HashMap;
import java.util.Map;

public class Main {
    public static final String BREAKFAST = "breakfast";
    public static final String LUNCH = "lunch";
    public static final String DINNER = "dinner";

    public static void main(String[] args) {
        Map<String, String> meals = new HashMap<>();
        meals.put(BREAKFAST, "Waffles");
        meals.put(LUNCH, "Gyros");
        meals.put(DINNER, "Enchiladas");

        System.out.println(meals.get("lunch"));
        
        String dinner = meals.remove(DINNER);

        boolean hasDinner = meals.containsKey(DINNER);
        boolean hasEnchiladas = meals.containsValue("Enchiladas");

        int size = meals.size();

        System.out.println(dinner + " " + hasDinner + " " + hasEnchiladas + " " + size);
    }    
}