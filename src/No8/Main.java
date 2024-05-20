package No8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int threshold = 25;

        List<Integer> filteredNumbers = filterNumbers(numbers, threshold);

        System.out.println("Числа, больше " + threshold + ": " + filteredNumbers);
    }

    public static List<Integer> filterNumbers(List<Integer> inputNumbers, int threshold) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : inputNumbers) {
            if (number > threshold) {
                result.add(number);
            }
        }
        return result;
    }
}

