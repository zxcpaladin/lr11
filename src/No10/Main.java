package No10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(10);
        originalList.add(20);
        originalList.add(30);
        originalList.add(40);
        originalList.add(50);

        int threshold = 35;
        List<Integer> filteredList = filterNumbers(originalList, threshold);

        System.out.println("Original List: " + originalList);
        System.out.println("Filtered List (numbers less than " + threshold + "): " + filteredList);
    }

    public static List<Integer> filterNumbers(List<Integer> inputList, int threshold) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : inputList) {
            if (number < threshold) {
                result.add(number);
            }
        }
        return result;
    }
}

