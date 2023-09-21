/*

    Time complexity: O(N)
    Space complexity: O(N)
    
    Where 'N' is the number of people at the party.

*/

import java.util.*;


public class brute {
	public static int findCelebrity(int n) {
		// Write your code here.
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < n; i++) {
			s.push(i);
		}

		while (s.size() > 1) {
			int id1 = s.pop();
			int id2 = s.pop();

			if (!Runner.knows(id1, id2)) {
				s.push(id1);
			} else {
				s.push(id2);
			}
		}
		int celebrity = s.peek();
		boolean knowAny = false, knownToAll = true;
		for (int i = 0; i < n; i++) {
			if (Runner.knows(celebrity, i)) {
				knowAny = true;
				break;
			}
		}

		for (int i = 0; i < n; i++) {
			if (i != celebrity && !Runner.knows(i, celebrity)) {
				knownToAll = false;
				break;
			}
		}

		if (!knownToAll || knowAny) {
			celebrity = -1;
		}
		return celebrity;
	}
}