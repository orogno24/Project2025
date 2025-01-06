package Package1;

import java.util.HashMap;
import java.util.Map;

public class Code01_06 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 6);
        System.out.println(map.get(1));
        System.out.println(map.get(6));
    }
}
