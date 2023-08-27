/**
 * Link :- https://leetcode.com/problems/rotate-list/description/
 *  Time Complexity: O(length of list) + O(length of list – (length of list%k))
 *  Reason: O(length of the list) for calculating the length of the list.
 *  O(length of the list – (length of list%k)) for breaking link.
 * 
 *  Space Complexity: O(1)
 */
class Node {
    public int data;
    public Node next;

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
};

public class optimal {
    public static Node rotate(Node head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
        Node temp = head;
        int len = 1;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }
        temp.next = head;
        k = k % len;

        k = len - k;

        while (k-- > 0) {
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;

        return head;
        // Write your code here.
    }
}