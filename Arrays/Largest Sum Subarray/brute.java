
/**
 * Time Complexity = O(n^2);
 * Space Complexity = O(1);
 */
class brute {
    public static int largestSubArray(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 7, -4, 3, 2, -10, 9, 1 };
        int ans = largestSubArray(arr, arr.length);
        System.out.println(ans);
    }
}