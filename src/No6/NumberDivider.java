package No6;

import java.util.ArrayList;
import java.util.List;

public class NumberDivider {
    public static List<Integer> filterByDivisor(List<Integer> numbers, int divisor) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % divisor == 0) {
                result.add(number);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(8, 9, 21, 19, 18, 22, 7);
        int divisor = 3;
        List<Integer> filteredNumbers = filterByDivisor(numbers, divisor);

        System.out.println("Numbers divisible by " + divisor + ": " + filteredNumbers);
    }
}
