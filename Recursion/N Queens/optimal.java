/*
    Time Complexity : O(N!)
    Space Complexity : O(N)

    Where N is the number of Queens.
*/


import java.util.ArrayList;

public class optimal {
    static void solve(int col, int arr[][], ArrayList<ArrayList<Integer>> ans, int ld[], int ud[], int lr[]) {
        if (col == arr.length) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    temp.add(arr[i][j]);
                }
            }
            ans.add(temp);
            return;
        }

        for (int row = 0; row < arr.length; row++) {
            if (lr[row] == 0 && ld[row + col] == 0 && ud[arr.length - 1 + col - row] == 0) {
                lr[row] = 1;
                ld[row + col] = 1;
                ud[arr.length - 1 + col - row] = 1;
                arr[row][col] = 1;
                solve(col + 1, arr, ans, ld, ud, lr);
                lr[row] = 0;
                ld[row + col] = 0;
                ud[arr.length - 1 + col - row] = 0;
                arr[row][col] = 0;
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {

        // Write your code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int leftRow[] = new int[n];
        int lowerDiag[] = new int[2 * n - 1];
        int upperDiag[] = new int[2 * n - 1];
        int[][] arr = new int[n][n];
        solve(0, arr, ans, lowerDiag, upperDiag, leftRow);
        return ans;
    }

}