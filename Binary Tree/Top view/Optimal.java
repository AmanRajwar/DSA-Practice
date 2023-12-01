/*
    Time Complexity: O(n * log(n))
    Space Complexity : O(n)

    Where 'n' is the number of nodes in the given binary tree.
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;


public class Optimal {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
   
        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

 static class Pair {
        int hd;
        TreeNode node;

        Pair(int hd, TreeNode node) {
            this.node = node;
            this.hd = hd;
        }
    }
     public static List<Integer> getTopView(TreeNode root) {
        // Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, root));
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (!q.isEmpty()) {
            Pair temp = q.remove();
            int hd = temp.hd;
            if (!map.containsKey(hd)) {
                map.put(hd, temp.node.data);
            }

            if (temp.node.left != null) {
                q.add(new Pair(hd - 1, temp.node.left));
            }
            if (temp.node.right != null) {
                q.add(new Pair(hd + 1, temp.node.right));
            }
        }
        for (int value : map.values()) {
            ans.add(value);
        }
        return ans;
    }
}
