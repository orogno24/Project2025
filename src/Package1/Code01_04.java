package Package1;

import java.util.HashMap;
import java.util.Map;

public class Code01_04 {
    public static void main(String[] args) {
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);

        items.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
