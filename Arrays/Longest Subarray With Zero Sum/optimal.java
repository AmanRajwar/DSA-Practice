/**
 * Link= https://shorturl.at/tuSV1
 * 
 * Time complexity = O(N); 
 *  
 * space complexity = O(N);
 */

import java.util.HashMap;

public class optimal {
    public static int getLongestZeroSumSubarrayLength(int[] arr) {
        // Write your code here.
        int maxi = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxi = i + 1;
            } else {
                if (map.containsKey(sum)) {
                    maxi = Math.max(maxi, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int a[] = { 9, -3, 3, -1, 6, -5 };
        System.out.println(getLongestZeroSumSubarrayLength(a));
    }
}