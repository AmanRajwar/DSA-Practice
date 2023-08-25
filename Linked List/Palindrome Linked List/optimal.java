/**
 * Link-https://bit.ly/3GqRMKv
 * Time complexity = O(N/2) + O(N/2) + O(N/2)
 * Space complexity = O(1)
 */

public class optimal {
    static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> pre = null;

        while (curr != null) {
            LinkedListNode<Integer> ahead = curr.next;
            curr.next = pre;
            pre = curr;
            curr = ahead;
        }
        return pre;
    }

    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        // Write your code here!
        if (head == null || head.next == null) {
            return true;
        }
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        LinkedListNode<Integer> temp = head;

        slow = reverse(slow.next);
        while (slow != null) {
            if (!temp.data.equals(slow.data))
                return false;

            slow = slow.next;
            temp = temp.next;
        }
        return true;

    }
}