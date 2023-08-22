/**
 * Link = https://bit.ly/3Iu7zMu
 * 
 * Time Complexity = O(N^2)
 * 
 * Space Complexity = O(1);
 */

public class brute {

    public static String read(int n, int[] book, int target) {
        // Write your code here.
        String a = "NO";
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (book[i] + book[j] == target) {
                    a = "YES";
                    break;
                }
            }
        }
        return a;
    }
    public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = read(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);
    }
}
