

/**
 * 
 * Link = https://shorturl.at/asQ08
 * Time complexity = O(N + M)
 * 
 * Space Complexity = O(1)
 */




class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class noExtraSpace {
    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        // Write your code here.

        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }
        LinkedListNode<Integer> head = null;

        if (first.data > second.data) {
            head = second;
            second = second.next;
        } else {
            head = first;
            first = first.next;
        }
        LinkedListNode<Integer> temp = head;
        while (first != null && second != null) {

            if (first.data > second.data) {
                temp.next = second;
                temp = temp.next;
                second = second.next;
            } else {
                temp.next = first;
                temp = temp.next;
                first = first.next;
            }
            temp.next = null;
        }

        if (second != null) {
            temp.next = second;
        } else if (first != null) {
            temp.next = first;
        }
        return head;

    }
}
