

/**
 * Link= https://shorturl.at/tuSV1
 * 
 * Time complexity = O(N^2); 
 *  
 * space complexity = O(1);
 */
public class brute {
    public static int getLongestZeroSumSubarrayLength(int[] arr) {
        // Write your code here.
        int maxi = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    maxi = Math.max(maxi, j - i + 1);
                }
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int a[] = {9, -3, 3, -1, 6, -5};
        System.out.println(getLongestZeroSumSubarrayLength(a));
    }
}