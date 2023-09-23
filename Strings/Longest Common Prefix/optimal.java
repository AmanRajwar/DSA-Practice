/*
    Time Complexity  : O(n*m)
    Space Complexity : O(m)

    where 'n' is the size of 'arr' and 'm' is the maximum length of 'arr[i]'.
*/

public class optimal {
    public static String commonPrefix(String[] arr, int n) {
        // Write your code here
        if (n == 1) {
            return arr[0];
        }
        String prefix = arr[0];
        for (int i = 1; i < n; i++) {
            prefix = findPrefix(prefix, arr[i]);
        }

        if (prefix == "") {
            return "-1";
        }

        return prefix;
    }

    // do string se common prefix nikal ke fir us prefix ko baki ke string
    // se compare krke final ans nikal ne ke liye
    public static String findPrefix(String st1, String st2) {

        // min length ---> kyuki kam size tak hi prefix ho sakta hai
        int len = Math.min(st1.length(), st2.length());
        String ans = "";

        for (int i = 0; i < len; i++) {
            if (st1.charAt(i) == st2.charAt(i)) {
                ans += st1.charAt(i);
            } else {
                break;
            }
        }
        return ans;
    }
}