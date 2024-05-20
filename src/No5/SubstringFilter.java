package No5;

import java.util.ArrayList;
import java.util.List;

public class SubstringFilter {

    public static List<String> filterStrings(List<String> inputList, String substring) {
        List<String> filteredList = new ArrayList<>();
        for (String str : inputList) {
            if (str.contains(substring)) {
                filteredList.add(str);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        List<String> inputList = List.of("apple", "banana", "cherry", "date", "anydesk");
        String substring = "an";
        List<String> filteredList = filterStrings(inputList, substring);
        System.out.println("Filtered list: " + filteredList);
    }
}

