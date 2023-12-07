/*
    Time Complexity : O(N)
    Space Complexity : O(N)

    Where 'N' is the number of nodes in the given binary tree.
*/

public class Optimal {


 class TreeNode<T> {
     public T data;
     public TreeNode<T> left;
     public TreeNode<T> right;

     TreeNode(T data) {
         this.data = data;
         left = null;
         right = null;
     }
 }


public class Solution {
    public static int helper(TreeNode<Integer> root, int[]ans){
        if(root==null){
            return 0;
        }
        int left = helper(root.left, ans);
        int right = helper(root.right, ans);
        ans[0] = Math.max(ans[0], left+right);

        return Math.max(left,right)+1;
    
    }
    public static int diameterOfBinaryTree(TreeNode<Integer> root) {
        // Write your code here.
        int []ans = new int[1];
        helper(root, ans);
        return ans[0];
    }
}
}
