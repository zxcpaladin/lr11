package No4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> squares = calculateSquares(numbers);

        System.out.println("Квадраты чисел: " + squares);
    }

    public static List<Integer> calculateSquares(List<Integer> inputNumbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : inputNumbers) {
            int square = number * number;
            result.add(square);
        }
        return result;
    }
}
