/**
 * Time Complexity = O(N)
 * 
 * space complexity = O(1)
 * 
 */

import java.util.*;

public class optimal {

    public static int removeDuplicates(ArrayList<Integer> arr) {
        int i = 0;
        for (int j = 1; j < arr.size(); j++) {
            if (arr.get(i) != arr.get(j)) {
                i++;
                arr.set(i, arr.get(j));
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 2, 3, 3));
        int k = removeDuplicates(arr);
        System.out.println("The ArrayList after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
