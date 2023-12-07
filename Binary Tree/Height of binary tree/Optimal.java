/*
    Time Complexity: O(n).
    Space Complexity: O(n).

    Where 'n' is the number of Nodes of the tree.
*/

// Another approaches are DFS and BFS


import java.util.*;

public class Optimal{
    static class Pair {
        int l;
        TreeNode node;

        Pair(int l, TreeNode node) {
            this.node = node;
            this.l = l;
        }
    }

    public static int heightOfBinaryTree(TreeNode root) {
        // Write your code here.
        if (root == null) {
            return 0;
        }
        int max= 0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(1, root));
        while (!q.isEmpty()) {
            Pair temp = q.poll();

            int level = temp.l;
            if( max<level){
                max=level;
            }

            if (temp.node.left != null) {
                q.add(new Pair(level+1, temp.node.left));
            }
            if (temp.node.right != null) {
                q.add(new Pair(level+1, temp.node.right));
            }
        }

        return max;
    }
}
