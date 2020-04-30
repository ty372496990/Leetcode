package is_valid_BST;

public class Main {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    private Integer tempVal = null;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST(root.left)) {
            return false;
        }
        if (tempVal != null && tempVal >= root.val) {
            return false;
        }
        tempVal = root.val;
        if (!isValidBST(root.right)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
