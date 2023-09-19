import java.util.ArrayDeque;
import java.util.Deque;

public class optimal {
	public static int[] maxSlidingWindow(int[] arr, int n, int k) {
		// Write your code here.

		Deque<Integer> d = new ArrayDeque<>();
		int ans[] = new int[n - k + 1];
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (!d.isEmpty() && d.peekFirst() == i - k) {
				d.pollFirst();
			}

			while (!d.isEmpty() && arr[d.peekLast()] < arr[i]) {
				d.pollLast();
			}
			d.addLast(i);
			if (i >= k - 1) {
				ans[count++] = arr[d.peekFirst()];
			}
		}
		return ans;
	}
}