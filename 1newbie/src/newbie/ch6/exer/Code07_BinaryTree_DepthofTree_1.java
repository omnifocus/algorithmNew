package newbie.ch6.exer;

/**
 *         1
 *       /   \
 *      2     2
 *     / \   / \
 *    3  4  4   3
 *
 https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class Code07_BinaryTree_DepthofTree_1 {

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
        System.out.println(checkDepth(rootNode1));

    }

    //TODO
    private static int checkDepth(TreeNode root) {
        return 0;
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
