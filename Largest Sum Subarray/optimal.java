/**
 * Time Complexity = O(n);
 * Space Complexity = O(1);
 */

public class optimal {
    public static int largestSubArray(int[] arr, int length) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < length; i++){
            sum = sum + arr[i];
            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0) {
            sum = 0;
            }
        }
        if (maxi < 0)
            maxi = 0;
        return maxi;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 7, -4, 3, 2, -10, 9, 1 };
        int ans = largestSubArray(arr, arr.length);
        System.out.println(ans);
    }

}
