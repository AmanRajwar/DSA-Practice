
/*
    Link - https://shorturl.at/hiqN7
    Time complexity: O(N)
    Space complexity: O(1)

    Where 'N' is the number of elements in the linked list
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

class brute {

    public static Node findMiddle(Node head) {
        // Write your code here.
        Node temp = head;
        int count = 0;

        if (head == null || head.next == null) {
            return head;
        }

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        temp = head;
        for (int i = 1; i < count / 2; i++) {
            temp = temp.next;
        }
        return temp.next;
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Find the middle node
        Node middleNode = brute.findMiddle(head);

        // Print all nodes starting from the middle node
        printNodesFromMiddle(middleNode);
    }

    public static void printNodesFromMiddle(Node middleNode) {
        Node current = middleNode;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}