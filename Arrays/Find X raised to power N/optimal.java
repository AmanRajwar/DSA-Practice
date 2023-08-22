/**
 *  Time Complexity: O(log n)
 *
 *  Space Complexity: O(1)
 */


public class optimal {
    public static double myPow(double x, int n) {
        // Write Your Code Here
        int nn = n;
        double ans = 1;
        if (nn < 0)
            nn = nn * -1;
        while (nn > 0) {
            if (nn % 2 == 1) {
                ans = ans * x;
                nn = nn - 1;
            } else {
                x = x * x;
                nn = nn / 2;
            }
        }
        if (n < 0)
            ans = 1.0 / ans;
            
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
