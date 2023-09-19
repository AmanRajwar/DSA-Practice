/*
    Time Complexity: O(Q) 
    Space Complexity: O(capacity)
    
    where Q is the number of the given queries and 
    capacity is the maximum number of keys LRU Cache can store.
*/

import java.util.HashMap;

public class optimal {
    class LRUCache {
        class Node {
            int data;
            int key;
            Node next, pre;

            Node(int data, int key) {
                this.data = data;
                this.key = key;
                next = null;
                pre = null;
            }
        }

        Node head = new Node(0, 0), tail = new Node(0, 0);
        HashMap<Integer, Node> map = new HashMap<>();
        int size;

        LRUCache(int capacity) {
            head.next = tail;
            tail.pre = head;
            size = capacity;
            // Write your code here
        }

        private void remove(Node node) {
            map.remove(node.key);
            node.pre.next = node.next;
            node.next.pre = node.pre;
            node.pre = null;
            node.next = null;
        }

        private void insert(Node node) {
            map.put(node.key, node);
            node.next = head.next;
            node.pre = head;
            head.next.pre = node;
            head.next = node;
        }

        public int get(int key) {
            if (map.containsKey(key)) {
                Node node = map.get(key);
                remove(node);
                insert(node);
                return node.data;
            } else {
                return -1;
            }
            // Write your code here
        }

        public void put(int key, int value) {
            // Write your code here
            if (map.containsKey(key)) {
                remove(map.get(key));
            } else if (size == map.size()) {
                remove(tail.pre);
            }
            insert(new Node(value, key));
        }
    }
}