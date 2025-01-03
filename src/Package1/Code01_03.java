package Package1;

import java.util.*;
import java.util.stream.Collectors;

public class Code01_03 {

    public static void main(String[] args) {
        System.out.println(streamList(Arrays.asList(1, 2, 3, 4)));
        System.out.println(streamSort(Arrays.asList("David", "Bob", "Charlie", "Alice")));
    }

    public static List<Integer> streamList(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }

    public static List<String> streamSort(List<String> names) {
        return names.stream().sorted().collect(Collectors.toList());
    }

}
