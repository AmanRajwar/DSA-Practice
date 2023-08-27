/**
 * Time Complexity = O(N*LogN)+O(N)
 * 
 * space complexity = O(N)
 * 
 */


import java.util.*;

public class brute {

    public static int removeDuplicates(ArrayList<Integer> arr) {
        // Write your code here.
        HashSet<Integer> set = new HashSet<>();
        for (int a : arr) {
            set.add(a);
        }
        int i = 0;
        for (int a : set) {
            arr.set(i++, a);
        }
        return i;
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
