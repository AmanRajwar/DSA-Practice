/**
 * Time Complexity: O( (2^n) *k*(n/2) )
 * 
 * Space Complexity: O(k * x)
 */


import java.util.List;
import java.util.ArrayList;

public class Solution {
    static void helper(String str, List<List<String>> ans, List<String> ds, int ind) {
        if (ind == str.length()) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = ind; i < str.length(); i++) {
            if (isPalindrome(str, ind, i)) {
                ds.add(str.substring(ind, i + 1));
                helper(str, ans, ds, i + 1);
                ds.remove(ds.size() - 1);
            }
        }
    }

    static boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--))
                return false;
        }
        return true;
    }

    public static List<List<String>> partition(String str) {
        // Write your code here.
        List<List<String>> ans = new ArrayList<>();
        helper(str, ans, new ArrayList<>(), 0);
        return ans;
    }
}
