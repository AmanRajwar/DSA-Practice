
/**
 * Time Complexity = O(N*log*N) + O( N * maximum difference between two stalls);
 * Space Complexity = O(1)
 */


import java.util.Arrays;

public class brute {
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
        int limit = stalls[n - 1] - stalls[0];
        int ans = 0;

        for (int i = 1; i <= limit; i++) {
            if (possible(stalls, i, k) == k) {
                ans = Math.max(ans, i);
            }
        }

        return ans;
    }
}