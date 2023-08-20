/**
 * Time Complexity: O(N)
 *
 *   Space Complexity: O(1)
 */


class brute{
     public static double myPow(double x, int n) {
        // Write Your Code Here
        double ans = 1;
        int nn=n;
        if(nn<0)
         nn=nn *-1;
        for (int i = 1; i <= nn; i++) {
            ans = ans * x;
        }
        if(n<0)
        return 1.0/ans;
        else return ans;
    }

    public static void main(String[] args) {
        
    }
}