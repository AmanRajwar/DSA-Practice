

class Node {
    public int data;
    public Node next;
    public Node child;

    Node() {
        this.data = 0;
        this.next = null;
        this.child = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.child = null;
    }

    Node(int data, Node next, Node child) {
        this.data = data;
        this.next = next;
        this.child = child;
    }
}

class optimal {
    public static Node flattenLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node ans = head;
        Node temp = ans.next;

        ans.next = null;
        while (temp != null) {
            ans = mergeTwoLists(ans, temp);
            temp = temp.next;
        }
        return ans;
    }

    public static Node mergeTwoLists(Node a, Node b) {

        Node temp = new Node(0);
        Node ans = temp;

        while (a != null && b != null) {
            if (a.data < b.data) {
                temp.child = a;
                temp = temp.child;
                a = a.child;
            } else {
                temp.child = b;
                temp = temp.child;
                b = b.child;
            }
        }
        if (a != null)
            temp.child = a;
        else
            temp.child = b;
        return ans.child;
    }

}
