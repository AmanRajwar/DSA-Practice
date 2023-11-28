import java.util.*;

public class Optimal {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class Pair {
        int hd;
        TreeNode node;

        Pair(int hd, TreeNode node) {
            this.hd = hd;
            this.node = node;
        }

    }

    public static List<Integer> bottomView(TreeNode root) {
        // Write your code here.

        ArrayList<Integer> ans = new ArrayList<Integer>();

        if (root == null)
            return ans;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, root));
        Map<Integer, Integer> map = new TreeMap<>();

        while (!q.isEmpty()) {
            Pair temp = q.remove();
            int hd = temp.hd;
            map.put(hd, temp.node.val);
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
