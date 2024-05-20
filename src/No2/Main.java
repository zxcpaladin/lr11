package No2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        int[] commonElements = getCommonElements(arr1, arr2);

        System.out.println(Arrays.toString(commonElements));
    }

    public static int[] getCommonElements(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }

        List<Integer> commonElements = new ArrayList<>();
        for (int num : arr2) {
            if (set.contains(num)) {
                commonElements.add(num);
            }
        }

        int[] result = new int[commonElements.size()];
        for (int i = 0; i < commonElements.size(); i++) {
            result[i] = commonElements.get(i);
        }

        return result;
    }
}
