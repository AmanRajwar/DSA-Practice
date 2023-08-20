import java.util.ArrayList;
import java.util.List;

public class optimal {
    public static List<Integer> getRow(int row) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        int temp = 1;
        for (int i = 1; i < row; i++) {
            temp = temp * (row - i);
            temp = temp / i;
            res.add(temp);
        }
        return res;
    }

    public static void pascalTriangle(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ans.add(getRow(i));
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int n = 5;
        pascalTriangle(n);
    }
}
