/**
 * Time Complexity: O(N) as for each index we are calculating 
 *                  leftMax and rightMax so it is a nested loop.
 * 
 * Space Complexity: O(1).
 * 
 */
public class optimal {
    public static long getTrappedWater(long[] arr, int n) {
        long ans = 0;
        long leftmax = 0;
        long rightmax = 0;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] > rightmax) {
                    leftmax = arr[left];
                } else {
                    ans += leftmax - arr[left];
                }
                left++;
            } else {
                if (arr[right] > rightmax) {
                    rightmax = arr[right];
                } else {
                    ans += rightmax - arr[right];
                }
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        long[] testArray = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int n = testArray.length;

        long trappedWater = getTrappedWater(testArray, n);

        System.out.println("Trapped Water: " + trappedWater);
    }
}
