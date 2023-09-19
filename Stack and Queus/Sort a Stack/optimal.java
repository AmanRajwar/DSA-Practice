/**
 * Time Complexity: O(N^2)
 * Space Complexity : O(N)
 */



import java.util.*;
import java.io.*;

public class optimal {
	static void sortedInsert(Stack<Integer> stack, int cur) {
		if (stack.isEmpty() || cur > stack.peek()) {
			stack.push(cur);
			return;
		}
		int top = stack.pop();
		sortedInsert(stack, cur);
		stack.push(top);
	}

	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
		if (stack.isEmpty()) {
			return;
		}
		int top = stack.pop();
		sortStack(stack);
		sortedInsert(stack, top);
	}

}