//  7. Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map.

package wk9;
import java.util.Map;
import java.util.HashMap;
public class Two7 {
    public static void main(String[] args) {
        HashMap<String, Integer> person = new HashMap<>();
        person.put("Jigar", 101);

        person.put("Arpita", 102);
        person.put("Shivam", 103);
        person.put("Dhwanil", 104);
        person.put("Akshit", 105);

        for (Map.Entry<String, Integer> pair: person.entrySet()) {
            System.out.format("key: %s, value: %d%n", pair.getKey(), pair.getValue());

            // person.entrySet().stream().forEach(e -> {
            //  System.out.format("key: %s, value: %d%n", e.getKey(), e.getValue());
            // });
        }
    }
}

