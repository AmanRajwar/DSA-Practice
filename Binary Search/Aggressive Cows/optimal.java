/**  
 * Maximum difference between two stalls = M
 * 
 * Time Complexity = O(N*log*N) + O(N* log *(M));
 * Space Complexity = O(1)
 */


import java.util.Arrays;

public class optimal {
    static int possible(int[] stalls, int gap, int k) {
        int preCow = stalls[0];
        int ans = 1;
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - preCow >= gap) {
                ans++;
                preCow = stalls[i];
            }
            if (ans > k) {
                break;
            }
        }
        return ans;
    }

    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;
        int end = stalls[n - 1] - stalls[0];
        int start = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (possible(stalls, mid, k) >= k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end;
    }
}