// Time Complexity: O(2N)

// Space Complexity: O(1)


class Node {
    public int data;
    public Node next;
    public Node prev;

    Node() {
        this.data = 0;
        this.next = null;
        this.prev = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
        this.prev = next;
    }
};

public class brute {
    public static Node removeKthNode(Node head, int K) {
        if (head.next == null && K == 1) {
            return null;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        count = count - K;
        if (count < 0)
            return head;

        if (count == 0) {
            temp = head.next;
            head.next = null;
            return temp;
        }
        temp = head;
        for (int i = 0; i < count - 1; i++)
        {
            temp = temp.next;
        }

        Node nodeToRemove = temp.next;
        temp.next = nodeToRemove.next;
        if (temp.next != null) {
            temp.next.prev = temp;
        }
        return head;
    }





    public static void main(String[] args) {
        // Create a sample doubly linked list: 1 <-> 2 <-> 3 <-> 4 <-> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.prev = head.next.next.next;

        int K = 3; // Remove the 3rd node (counting from 1)

        // Remove the Kth node
        Node newHead = brute.removeKthNode(head, K);

        // Print the modified linked list
        printLinkedList(newHead);
    }

    // Helper function to print a doubly linked list
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" <-> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}