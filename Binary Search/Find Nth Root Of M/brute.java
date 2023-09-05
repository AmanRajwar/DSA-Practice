/**
    Time Complexity: O( N * log(M) )
    Space Complexity: O( 1 )
    Where 'N' and 'M' are given integers.
 */

public class brute {
    static long func(int i, int n) {
        long base = (long) i;
        long ans = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                n--;
                ans = ans * base;
            } else {
                n = n / 2;
                base = base * base;
            }
        }
        return ans;
    }

    public static int NthRoot(int n, int m) {
        // Write your code here.
       

        for (int i = 1; i <= m; i++) {
            long val = func(i, n);
            if (val == (long) m) {
                return i;
            } else if (val > m) {
                break;
            }
        }
        return -1;
    }
}
