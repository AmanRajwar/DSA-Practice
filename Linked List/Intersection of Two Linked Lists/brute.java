/**
 *  Time Complexity= O(N * M)
 *  
 *  Space complexity = O(1);
 *  Link =https://bit.ly/3fiMQeG
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

public class brute {
    public static int findIntersection(Node firstHead, Node secondHead) {
        // Write your code here

        Node l1 = firstHead;

        while (l1 != null) {
            Node l2 = secondHead;
            while (l2 != null) {
                if (l1.next == l2.next) {
                    return l1.next.data;
                }

                l2 = l2.next;
            }
            l1 = l1.next;
        }
        return -1;
    }
}