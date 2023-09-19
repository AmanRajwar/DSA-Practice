/**
 * Time Complexity: O(N)
 * Space Complexity:O(N)
 */
import java.util.Stack;

public class optimal {
    public static int[] nextGreaterElement(int[] arr, int n) {
        // Write your code here.
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[n];
        int i = n - 1;
        while (i >= 0) {
            if (s.isEmpty()) {
                s.push(arr[i]);
                ans[i] = -1;
                i--;
            } else if (s.peek() <= arr[i]) {
                s.pop();
            } else if (s.peek() > arr[i]) {
                ans[i] = s.peek();
                s.push(arr[i]);
                i--;
            }
        }
        return ans;
    }
}