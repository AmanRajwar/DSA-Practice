
// Time Complexity: O(max(m,n)). Assume that m and n represent the
//                  length of l1 and l2 respectively, the algorithm 
//                  above iterates at most max(m,n) times.

// Space Complexity: O(max(m,n)). The length of the new list is at most max(m,n)+1.

import java.util.*;
import java.io.*;

class LinkedListNode {
    int data;
    LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
    }
}

public class solution {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        LinkedListNode l1 = head1;
        LinkedListNode l2 = head2;
        LinkedListNode dummy = new LinkedListNode(0);
        LinkedListNode d = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;

            if (l1 != null) {
                sum = sum + l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;

            }

            sum += carry;
            carry = sum / 10;
            LinkedListNode temp = new LinkedListNode(sum % 10);
            d.next = temp;
            d = d.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        // Create the first linked list: 2 -> 4 -> 3 (represents the number 342)
        LinkedListNode l1 = new LinkedListNode(5);
        l1.next = new LinkedListNode(6);
        l1.next.next = new LinkedListNode(3);

        // Create the second linked list: 5 -> 6 -> 4 (represents the number 465)
        LinkedListNode l2 = new LinkedListNode(8);
        l2.next = new LinkedListNode(4);
        l2.next.next = new LinkedListNode(2);

        // Call the addTwoNumbers function to add the two numbers
        LinkedListNode result = addTwoNumbers(l1, l2);

        // Print the result (linked list)
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}