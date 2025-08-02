package ch6;

/**
 *         1
 *       /   \
 *      2     2
 *     / \   / \
 *    3  4  4   3
 *
 https://leetcode.com/problems/symmetric-tree/
 */
public class Code06_BinaryTree_SymmtricTree {

    private static class TreeNode {
        int  val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        TreeNode rootNode1 = constructTree();
        System.out.println(isSymmetric(rootNode1));

    }

    private static boolean isSymmetric(TreeNode root) {
       if (root == null) return true;
       return isSymmetric(root.left,root.right);
    }

    private static boolean isSymmetric(TreeNode n1, TreeNode n2) {
        if (n1 == null ^ n2 == null) return false;
        if (n1 == null && n2 == null) return true;
        return n1.val == n2.val && isSymmetric(n1.left, n2.right) && isSymmetric(n1.right,n2.left);
    }

    private static TreeNode constructTree() {
        TreeNode rootNode = new TreeNode(1);
        rootNode.left = new TreeNode(2);
        rootNode.right = new TreeNode(2);
        rootNode.left.left = new TreeNode(3);
        rootNode.left.right = new TreeNode(4);
        rootNode.right.left = new TreeNode(4);
        rootNode.right.right = new TreeNode(3);
        return rootNode;
    }

}
