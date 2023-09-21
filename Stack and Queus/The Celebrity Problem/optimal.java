/*
    Time complexity: O(N)
    Space complexity: O(1)
    
    Where 'N' is the number of people at the party.
*/
 
public class optimal {

	public static int findCelebrity(int n) {
		// Write your code here.
		int start = 0;
		int end = n - 1;

		while (start < end) {
			if (Runner.knows(start, end)) {
				start++;
			} else {
				end--;
			}
		}
		int celebrity = start;
		boolean knowAny = false, knownToAll = true;
		for (int i = 0; i < n; i++) {
			if (celebrity != i && Runner.knows(celebrity, i)) {
				knowAny = true;
				break;
			}
		}

		for (int i = 0; i < n; i++) {
			if (celebrity != i && !Runner.knows(i, celebrity)) {
				knownToAll = false;
				break;
			}
		}

		if (knowAny || !knownToAll) {
			celebrity = -1;
		}
		return celebrity;
	}
}