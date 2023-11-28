



public class optimal {
    public static void helper(TreeNode<Integer> root, int level, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }

        if (result.size() == level) {
            result.add(root.data);
        }
        helper(root.left, level + 1, result);
        helper(root.right, level + 1, result);

    }

    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) {
        // Write your code here.
        ArrayList<Integer> result = new ArrayList<>();
        helper(root, 0, result);
        return result;
    }
}
