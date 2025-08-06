package ch7.exer;


import ch6.Code07_BinaryTree_DepthofTree;

/**
 * https://leetcode.com/problems/balanced-binary-tree/
 */
public class Code02_Balanced_Binary_Tree_1 {

    public static void main(String[] args) {

        TreeNode root = constructTree();
        new Code02_Balanced_Binary_Tree_1().isBalanced(root);
    }

    public boolean isBalanced(TreeNode root) {
        return process(root).isBalanced;
    }

    private static TreeNode constructTree() {
        TreeNode rootTreeNode = new TreeNode(3);
        rootTreeNode.left = new TreeNode(9);
        rootTreeNode.right = new TreeNode(20);

        rootTreeNode.right.left = new TreeNode(15);
        rootTreeNode.right.right = new TreeNode(7);
        return rootTreeNode;
    }


    public Info process(TreeNode node) {
        if (node == null) return new Info(0, true);
        Info left = process(node.left);
        Info right = process(node.right);
        System.out.println(left.isBalanced + "------" + left.height);
        boolean isBalanced = left.isBalanced && right.isBalanced && Math.abs(left.height - right.height) <= 1;
        int height = 1 + Math.max(left.height, right.height);
        System.out.println(left.isBalanced + "---" + right.isBalanced + "---" + Math.abs(left.height - right.height));
        System.out.println(node.val + "--" + isBalanced + "--" + height);
        return new Info(height, isBalanced);
    }

    static class Info {
        int height;
        boolean isBalanced;

        Info(int height, boolean isBalanced) {
            this.height = height;
            this.isBalanced = isBalanced;
        }
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }


}

