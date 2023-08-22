/**
 * Given row number r and column number c.
 * Print the element at position (r, c) in Pascal’s triangle.
 * ___________________________________________________________________
 * 
 *                           HINT
 * -------------------------------------------------------------------
 * Use the combination formula to get the the element at position (r,c).
 * Formula = n! / ( r! ( n-r )! )
 * 
 * Time complexity = O(n)+ O(r) + O(d) d= n-r; 
 */

public class brute {

    public static int getElement(int n) {
        int ans = 1; // Initialize ans with 1 instead of 0
        for (int i = 1; i <= n; i++) { // Change the loop condition to <= n
            ans = ans * i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 6;//no. of rows
        int r = 5;// no. of coll
        int c = (n-1) - (r-1); //difference
        n = getElement(n - 1);
        r = getElement(r - 1);
        c = getElement(c);

        int ans= n/(r*c);
        System.out.println(ans);

    }
}
