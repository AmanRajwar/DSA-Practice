import java.util.ArrayList;
import java.util.Stack;

public class optimal {
    public static int largestRectangle(ArrayList<Integer> heights) {
        // Write your code here.
        int n = heights.size();
        int leftSmall[] = new int[n];
        int rightSmall[] = new int[n];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && heights.get(s.peek()) >= heights.get(i)) {
                s.pop();
            }
            if (s.isEmpty()) {
                s.push(i);
                leftSmall[i] = 0;
            } else {
                leftSmall[i] = s.peek() + 1;
                s.push(i);
            }
        }

        while (!s.isEmpty()) {
            s.pop();
        }

        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights.get(s.peek()) >= heights.get(i)) {
                s.pop();
            }
            if (s.isEmpty()) {
                s.push(i);
                rightSmall[i] = n - 1;
            } else {
                rightSmall[i] = s.peek() - 1;
                s.push(i);
            }
        }
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int currArea = (rightSmall[i] - leftSmall[i] + 1) * heights.get(i);

            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }
}