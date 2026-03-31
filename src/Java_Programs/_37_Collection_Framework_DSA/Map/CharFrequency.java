import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        String name = "anuj rajput";

        Map<Character, Integer> map = new HashMap<>();

        for (char c : name.toCharArray()) {

            if (c != ' ') { // ignore space

                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }

        // Print result
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue());
        }
    }
}
