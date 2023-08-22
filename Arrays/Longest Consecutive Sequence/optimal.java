
/**
 * Link= https://shorturl.at/kovI6
 * 
 * Time complexity = O(2N)
 * 
 * space Complexity = 0(N)
 */


import java.util.HashSet;

public class optimal {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        HashSet<Integer> set = new HashSet<>();
        for (Integer e : arr) {
            set.add(e);
        }
        int maxi = 1;
        for (Integer element : arr) {
            int preCseEle = element - 1;
            if (!set.contains(preCseEle)) {
                int j = element;
                while (set.contains(j)) {
                    j++;
                }
                maxi = Math.max(maxi, j-element);
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] a = { 100, 200, 1, 2, 3, 4 };
        int ans = lengthOfLongestConsecutiveSequence(a, a.length);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
