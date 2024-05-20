package No9;

import java.util.ArrayList;
import java.util.List;

public class StringFilter {

    public static List<String> filterStrings(List<String> inputList) {
        List<String> result = new ArrayList<>();
        for (String str : inputList) {
            if (str.matches("[a-zA-Z]+")) {
                result.add(str);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("Hello, World!");
        inputList.add("123");
        inputList.add("OnlyLetters");
        inputList.add("Special@Characters");

        List<String> filteredList = filterStrings(inputList);
        System.out.println("Filtered List:");
        for (String str : filteredList) {
            System.out.println(str);
        }
    }
}

