package No1;

import java.util.*;

public class EvenNumbersArray {
    public static int[] getEvenNumbers(int[] arr) {
        List<Integer> evenList = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }
        int[] evenArray = new int[evenList.size()];
        for (int i = 0; i < evenList.size(); i++) {
            evenArray[i] = evenList.get(i);
        }
        return evenArray;
    }

    public static void main(String[] args) {
        int[] myArray = {5, 5, 8, 9, 7, 4, 4, 2, 3};
        int[] evenResult = getEvenNumbers(myArray);
        System.out.println(Arrays.toString(evenResult));
    }
}

