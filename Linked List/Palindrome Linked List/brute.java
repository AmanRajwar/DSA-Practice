
/**
 * Link-https://bit.ly/3GqRMKv
 * Time complexity = O(N)
 * Space complexity = O(N)
 */


import java.util.*;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class brute {

    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        // Write your code here!
        if (head == null || head.next == null) {
            return true;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        LinkedListNode<Integer> dummy = head;
        while (dummy != null) {
            temp.add(dummy.data);
            dummy = dummy.next;
        }
        int n = temp.size();
        for (int i = 0; i < n / 2; i++) {
            if (!temp.get(i).equals(temp.get(n - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}