/**
 *   Given the row number n. Print the n-th row of Pascal’s triangle.
 * ____________________________________________________________________
 *  
 *   Time Complexity: O(n*r), where n is the given row number,
 *                    and r is the column index which can vary 
 *                    from 0 to n-1.
 *  
 *   Reason: We are calculating the element for each column.
 *           Now, there are total n columns, and for each column,
 *           the calculation of the element takes O(r) time where
 *           r is the column index.
 *  
 *    Space Complexity: O(1) as we are not using any extra space.
 */





import java.util.ArrayList;
import java.util.List;

public class brute {

   public static long nCr(int n, int r) {
        long res = 1;

        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static void pascalTriangle(int n) {
        // printing the entire row n:
        for (int c = 1; c <= n; c++) {
            System.out.print(nCr(n - 1, c - 1) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        pascalTriangle(n);
    }





/** using list  */

    // public static List<Integer> getRow(int row) {
    //     List<Integer> ans = new ArrayList<>();
    //     ans.add(1);
    //     int temp = 1;
    //     for (int i = 1; i <= row; i++) {
    //         for (int j = 0; j < i; j++) {
    //             temp = temp * (row - j);
    //             temp = temp / (j + 1);
    //         }
    //         ans.add(temp);
    //         temp = 1;
    //     }
    //     return ans;
    // }

    // public static List<Integer> pascalTri(int row) {
    //     return getRow(row - 1);
    // }

    // public static void main(String[] args) {
    //     int row = 6;
    //     List<Integer> ans = pascalTri(row);
    //     System.out.println(ans);
    // }
}
