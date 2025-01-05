package Package1;

import java.util.stream.IntStream;

public class Code01_05 {
    public static void main(String[] args) {

        int[] numbers = IntStream.rangeClosed(1, 100).toArray();

        int result = intMethod(numbers);

        System.out.println(result);

    }

    public static int intMethod(int[] numArr) {
        return IntStream.of(numArr).parallel().sum();
    }
}
