

/**
 * 
 * It is an Recursive approach
 * 
 * Link- https://shorturl.at/hoC28
 * 
 * Time complexity= O(n)
 * space complexity = O(1)
 * 
 */

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class recursive {
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) {

        if (head == null || head.next == null) {
            return head;
        }
        LinkedListNode<Integer> newHead = reverseLinkedList(head.next);
        head.next.next= head;
        head.next= null;
        return newHead;
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        LinkedListNode<Integer> head = new LinkedListNode<>(1);
        head.next = new LinkedListNode<>(2);
        head.next.next = new LinkedListNode<>(3);
        head.next.next.next = new LinkedListNode<>(4);
        head.next.next.next.next = new LinkedListNode<>(5);

        // Print the original linked list
        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Reverse the linked list using the reverseLinkedList function
        LinkedListNode<Integer> reversedHead = recursive.reverseLinkedList(head);

        // Print the reversed linked list
        System.out.println("\nReversed Linked List:");
        printLinkedList(reversedHead);
    }

    // Helper function to print a linked list
    public static void printLinkedList(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

