/*
    Time Complexity : O(N)
    Space Complexity : O(N)

    Where N is the number of nodes in the tree.
*/


import java.util.ArrayList;
import java.util.List;

public class Optimal {
    public class BinaryTreeNode {
        int data;
        BinaryTreeNode left;
        BinaryTreeNode right;

        BinaryTreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    };

    public static void helper(BinaryTreeNode root, ArrayList<String> ans, String res) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            res += Integer.toString(root.data);
            ans.add(res);
        }
        res += Integer.toString(root.data) + " ";
        helper(root.left, ans, res);
        helper(root.right, ans, res);

    }

    public static List<String> allRootToLeaf(BinaryTreeNode root) {
        // Write your code here.
        ArrayList<String> ans = new ArrayList<>();
        helper(root, ans, "");
        return ans;
    }
}
