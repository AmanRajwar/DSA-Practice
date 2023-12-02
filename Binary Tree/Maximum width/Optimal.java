/*
    Time Complexity : O(N)
    Space Complexity : O(N)

    Where 'N' is the number of nodes in the given binary tree.
 */

import java.util.LinkedList;
import java.util.Queue;

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

    public static int getMaxWidth(TreeNode root) {
        // Write your code here.
        if (root == null) {
            return 0;
        }

        int max = 0;
        int width = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            width = q.size();

            if (max < width) {
                max = width;
            }
            while (width > 0) {
                TreeNode temp = q.poll();

                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }

                width -= 1;
            }

        }

        return max;
    }
}
