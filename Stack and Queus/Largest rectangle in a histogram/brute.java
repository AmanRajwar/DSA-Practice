import java.util.ArrayList;

public class brute {
    public static int largestRectangle(ArrayList<Integer> heights) {
        // Write your code here.
        int n = heights.size();
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int minHeight = Integer.MAX_VALUE;
            for (int j = i; j < n; j++) {
                minHeight = Math.min(minHeight, heights.get(j));
                maxArea = Math.max(maxArea, minHeight * (j - i + 1));
            }
        }
        return maxArea;
    }
}
