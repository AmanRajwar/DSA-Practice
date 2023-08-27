/**
 * Time Complexity: O(N)+O(N)+O(N)
 * 
 * Reason: Each step takes O(N) of time
 *         complexity.
 * 
 * Space Complexity: O(1)
 */
class Node {
    public int data;
    public Node next;
    public Node random;

    Node() {
        this.data = 0;
        this.next = null;
        this.random = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }

    Node(int data, Node next, Node random) {
        this.data = data;
        this.next = next;
        this.random = random;
    }
}

public class optimal {
    public static Node cloneLL(Node head) {
        // Write your code here.
        Node itr = head;

        while (itr != null) {
            Node a = new Node(itr.data);
            a.next = itr.next;
            itr.next = a;
            itr = a.next;
        }

        itr = head;
        while (itr != null) {
            if (itr.random != null)
                itr.next.random = itr.random.next;
            itr = itr.next.next;
        }

        Node dummy = new Node(0);
        itr = head;
        Node temp = dummy;
        Node fast;
        while (itr != null) {
            fast = itr.next.next;
            temp.next = itr.next;
            itr.next = fast;
            temp = temp.next;
            itr = fast;
        }
        return dummy.next;
    }
}