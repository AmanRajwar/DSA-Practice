/**
 * Link - https://leetcode.com/problems/linked-list-cycle-ii/description/
 * 
 * Time complexity = O(N)
 * Space complexity = O(1)
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class optimal {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode entry = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                while (slow != entry) {
                    slow = slow.next;
                    entry = entry.next;
                }
                return slow;
            }
        }
        return null;
    }

}
