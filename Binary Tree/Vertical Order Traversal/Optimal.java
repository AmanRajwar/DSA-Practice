
import java.util.*;
import java.io.*;

public class Optimal {

    public static class TreeNode<T> {
        public T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    };

    public static class Tupple {
        TreeNode<Integer> node;
        int hd;
        int l;

        Tupple(TreeNode<Integer> node, int hd, int l) {
            this.node = node;
            this.hd = hd;
            this.l = l;
        }
    }

    public static ArrayList<Integer> verticalOrderTraversal(TreeNode<Integer> root) {
        // Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Queue<Tupple> q = new LinkedList<>();
        TreeMap<Integer, TreeMap<Integer, Queue<Integer>>> map = new TreeMap<>();

        q.add(new Tupple(root, 0, 0));

        while (!q.isEmpty()) {
            Tupple temp = q.poll();
            TreeNode<Integer> node = temp.node;
            int hd = temp.hd;
            int l = temp.l;

            if (!map.containsKey(hd)) {
                map.put(hd, new TreeMap<>());
            }
            if (!map.get(hd).containsKey(l)) {
                map.get(hd).put(l, new LinkedList<>());
            }

            map.get(hd).get(l).add(node.data);

            if(node.left!=null){
                q.add(new Tupple(node.left, hd-1, l+1));
            }
            if(node.right!=null){
                q.add(new Tupple(node.right, hd+1, l+1));
            }
        }

        for (TreeMap<Integer, Queue<Integer>> value : map.values()) {
            for (Queue<Integer> res : value.values()) {
                while (!res.isEmpty()) {
                    int output = res.poll();
                    ans.add(output);
                }

            }
        }

        return ans;
    }

}
