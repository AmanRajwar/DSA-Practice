/**
 * 
 * Link= https://bit.ly/3fiMQeG
 * 
 * Time Complexity: O(2*max(length of list1,length of list2))
 * 
 * Reason: Uses the same concept of the difference of lengths of two lists.
 * 
 * Space Complexity: O(1)
 * 
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
}

public class optimal {
    public static int findIntersection(Node firstHead, Node secondHead) {
        // Write your code here
        // if(firstHead==null || secondHead==null) return -1;

        Node l1 = firstHead;
        Node l2 = secondHead;

        while (l1 != l2) {
            l1 = l1 == null ? secondHead : l1.next;
            l2 = l2 == null ? firstHead : l2.next;
        }

        return l1.data;
    }
}
