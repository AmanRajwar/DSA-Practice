/*
 *   Given the number of rows n. Print the first n rows of Pascal’s triangle.
 * 
 * 
 */



import java.util.ArrayList;
import java.util.List;

public class brute {
    public static List<Integer> nCr(int row) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        int temp = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < i; j++) {
                temp = temp * (row - j);
                temp = temp / (j + 1);
            }
            ans.add(temp);
            temp = 1;
        }
        return ans;
    }

    public static void pascalTriangle(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        ans.add(row1);

        // printing the entire row n:
        for (int row = 1; row < n; row++) {
            List<Integer> temp = nCr(row);
            ans.add(temp);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int n = 5;
        pascalTriangle(n);
    }
}

