/**
 * Link - https://leetcode.com/problems/linked-list-cycle-ii/description/
 * 
 * Time complexity = O(N)
 * Space complexity = O(N)
 */

import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class brute {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> temp = new HashSet<>();
        ListNode dummy = head;

        while (dummy != null) {
            if (temp.contains(dummy)) {
                return dummy;
            }
            temp.add(dummy);
            dummy = dummy.next;
        }
        return null;
    }

}
