package No3;

import java.util.ArrayList;
import java.util.List;

public class StringFilter {

    public static List<String> filterUpperCase(List<String> inputList) {
        List<String> result = new ArrayList<>();
        for (String s : inputList) {
            if (!s.isEmpty() && Character.isUpperCase(s.charAt(0))) {
                result.add(s);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("Hello");
        inputList.add("world");
        inputList.add("school");
        inputList.add("Java");
        inputList.add("Language");

        List<String> filteredList = filterUpperCase(inputList);
        System.out.println("Filtered list:");
        for (String s : filteredList) {
            System.out.println(s);
        }
    }
}
