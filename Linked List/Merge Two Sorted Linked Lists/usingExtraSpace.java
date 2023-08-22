/**
 * 
 * Link = https://shorturl.at/asQ08
 * Time complexity = O(N + M)
 * 
 * Space Complexity = O(N + M)
 */

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

class usingExtraSpace {

    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        // Create a new dummy node as the starting point for the merged list
        LinkedListNode<Integer> dummy = new LinkedListNode<>(0);
        LinkedListNode<Integer> current = dummy;

        while (first != null && second != null) {
            if (first.data <= second.data) {
                current.next = new LinkedListNode<>(first.data);
                first = first.next;
            } else {
                current.next = new LinkedListNode<>(second.data);
                second = second.next;
            }
            current = current.next;
        }

        // If one of the lists is not empty, add its remaining elements to the merged
        // list
        if (first != null) {
            current.next = copyLinkedList(first);
        } else if (second != null) {
            current.next = copyLinkedList(second);
        }

        return dummy.next; // Skip the dummy node to get the actual merged list
    }

    // Helper function to create a copy of a linked list
    public static LinkedListNode<Integer> copyLinkedList(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> newHead = null;
        LinkedListNode<Integer> tail = null;

        while (head != null) {
            LinkedListNode<Integer> newNode = new LinkedListNode<>(head.data);
            if (newHead == null) {
                newHead = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            head = head.next;
        }

        return newHead;
    }
}
