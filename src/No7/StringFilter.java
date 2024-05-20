package No7;

import java.util.ArrayList;
import java.util.List;

public class StringFilter {

    public static List<String> filterByLength(List<String> strings, int minLength) {
        List<String> filteredStrings = new ArrayList<>();
        for (String s : strings) {
            if (s.length() > minLength) {
                filteredStrings.add(s);
            }
        }
        return filteredStrings;
    }

    public static void main(String[] args) {
        List<String> inputStrings = List.of("apple", "banana", "cherry", "date", "school");
        int minLength = 5;
        List<String> filteredList = filterByLength(inputStrings, minLength);
        System.out.println("Filtered strings with length greater than " + minLength + ": " + filteredList);
    }
}

