// Time Complexity: O(logN), N = size of the given array.
// Reason: We are basically using binary search to find the minimum.
// space Complexity = O(1)


public class optimal {
    static long func(int mid, int n, int m) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m)
                return 2;
        }
        if (ans == m) {
            return 1;
        }
        return 0;
    }

    public static int NthRoot(int n, int m) {
        // Write your code here.
        int start = 0;
        int end = m - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            long val = func(mid, n, m);
            if( val ==1){
                return mid;
            }else if(val==2){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
