/**
 * Time Complexity: O(N) * O(N) = O(N^2)
 * 
 * Space Complexity: O(N) 
 */

import java.util.ArrayList;

public class optimal {

    public static String kthPermutation(int n, int k) {
        int fact = 1;
        String str = "";
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            fact *= i;
            ans.add(i);
        }
        ans.add(n);
        k--;
        while (true) {
            str = str + ans.get(k / fact);
            ans.remove(k / fact);
            if (ans.size() == 0) {
                break;
            }
            k = k % fact;
            fact = fact / ans.size();
        }
        return str;

    }
}