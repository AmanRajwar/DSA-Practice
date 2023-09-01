/**
 * Time complexity: O(N! * N) +O(N! Log N!)
 * Space complexity: O(N) 
 */


import java.util.ArrayList;
import java.util.Collections;

public class brute {
    static void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;

    }

    static void helper(char[] ch, ArrayList<String> ans, int ind) {
        if (ind == ch.length) {
            String str = new String(ch);
            ans.add(str);
            return;
        }

        for (int i = ind; i < ch.length; i++) {
            swap(ch, ind, i);
            helper(ch, ans, ind + 1);
            swap(ch, ind, i);
        }
    }

    public static String kthPermutation(int n, int k) {
        String str = "";
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            str += i;
        }
        helper(str.toCharArray(), ans, 0);
        Collections.sort(ans);
        return ans.get(k - 1);
    }
}