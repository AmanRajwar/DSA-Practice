// Time Complexity: O(N)

// Space Complexity: O(1)




public class optimal {
    
    public static Node removeKthNode(Node head, int K) {
        Node fast = head;
        Node slow = head;

        for( int i=0;i<K;i++){
            fast=fast.next;
        }

        while( fast.next!=null){
            fast=fast.next;
            slow= slow.next;
        }

        Node nodeToDel = slow.next;
        slow.next = nodeToDel.next;
        nodeToDel.next=null;
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
        Node newHead = removeKthNode(head, K);

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