
/**  Link= https://shorturl.at/kovI6
 * 
 * Time complexity = O(N + N * LogN)
 * 
 * space Complexity = 0(1)
 */

import java.io.*;
import java.util.*;

public class better {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        Arrays.sort(arr);
        int count = 1;
        int maxi = 1;
        for (int i = 0; i < N - 1; i++) {
            if (arr[i + 1] - arr[i] == 1) {
                count++;
            } else if (arr[i + 1] == arr[i]) {
                continue;
            } else {
                count = 0;
            }
            maxi = Math.max(maxi, count);
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] a = { 100, 200, 1, 2, 3, 4 };
        int ans = lengthOfLongestConsecutiveSequence(a, a.length);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
