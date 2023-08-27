/**
 * Time Complexity: O(N*N) as for each index we are calculating 
 *                  leftMax and rightMax so it is a nested loop.
 * 
 * Space Complexity: O(1).
 * 
 */

public class brute {
    public static long getTrappedWater(long[] arr, int n) {
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long leftmax = 0;
            long rightmax = 0;
            int j = i;
            while (j >= 0) {
                leftmax = Math.max(leftmax, arr[j]);
                j--;
            }
            j = i;
            while (j < n) {
                rightmax = Math.max(rightmax, arr[j]);
                j++;

            }
            ans = ans + Math.min(rightmax, leftmax) - arr[i];

        }
return ans;
    }
    public static void main(String[] args) {
        long[] testArray = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = testArray.length;
    
        long trappedWater = getTrappedWater(testArray, n);
        
        System.out.println("Trapped Water: " + trappedWater);
    }
}