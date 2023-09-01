/**
 *   Time Complexity: O(2^n)+O(2^n log(2^n)). Each index has two ways. 
 *       You can either pick it up or not pick it. So for n index time 
 *       complexity for O(2^n) and for sorting it will take (2^n log(2^n)).
 *   
 *   Space Complexity: O(2^n) for storing subset sums, since 2^n subsets
 *       can be generated for an array of size n.
 */



import java.util.*;
import java.io.*;

public class optimal {    
    public static void helper(int i, int sum, int num[], ArrayList<Integer> sumSubset, int n) {
        if (i == n) {
            sumSubset.add(sum);
            return;
        }
        helper(i + 1, sum + num[i], num, sumSubset, n);
        helper(i + 1, sum, num, sumSubset, n);
    }

    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ArrayList<Integer> sumSubset = new ArrayList<>();
        helper(0, 0, num, sumSubset, num.length);
        Collections.sort(sumSubset);
        return sumSubset;
    }

}