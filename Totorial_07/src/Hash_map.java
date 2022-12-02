import java.util.HashMap;
public class Hash_map {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Sri Lanka", "Kandy");
        capitalCities.put("India", "Delhi");

        capitalCities.clear();
        System.out.println(capitalCities);

    }

}
