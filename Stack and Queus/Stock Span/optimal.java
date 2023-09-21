/*
    Time complexity : O( n )
    Space complexity: O( n )

    Where 'n' is the size of the array.
*/

import java.util.Stack;

public class optimal {
    public static int[] findStockSpans(int[] prices) {
        // Write your code here.
        int ans[] = new int[prices.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!s.isEmpty() && prices[s.peek()] < prices[i]) {
                s.pop();
            }
            ans[i] = s.isEmpty() ? i + 1 : i - s.peek();
            s.push(i);

        }
        return ans;
    }
}

 