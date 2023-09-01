/*
    Time Complexity: O(3^(N^2))
    Space Complexity: O(N*N)

    Where 'N*N' is the total number of cells in the maze.
*/

import java.util.ArrayList;
import java.util.List;

public class optimal {
    static void helper(int[][] maz, List<String> ans, int i, int j, String str, boolean visi[][]) {

        if (i < 0 || i >= maz.length || j >= maz.length || j < 0 || maz[i][j] == 0 || visi[i][j]) {
            return;
        }
        if (i == maz.length - 1 && j == maz.length - 1) {
            ans.add(str);
            return;
        }
        visi[i][j] = true;

        helper(maz, ans, i + 1, j, str + "D", visi);
        helper(maz, ans, i - 1, j, str + "U", visi);
        helper(maz, ans, i, j + 1, str + "R", visi);
        helper(maz, ans, i, j - 1, str + "L", visi);
        visi[i][j] = false;
    }

    public static List<String> ratMaze(int[][] mat) {
        // Write your code here.

        boolean a[][] = new boolean[mat.length][mat.length];
        List<String> ans = new ArrayList<>();
        helper(mat, ans, 0, 0, "", a);
        return ans;
    }
}