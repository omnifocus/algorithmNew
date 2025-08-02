package ch6;

/**
 *         1
 *       /   \
 *      2     3
 *     / \   / \
 *    4  5  6   7
 *  / \
 * 8  9
 https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 */
public class Code08_BinaryTree_ConstructFromPreAndInOrder {

    private static class TreeNode {
        int  val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }


    public static void main(String[] args) {
        // 这组就是要加 L1 > R1 的原因
        int[] preorder = new int[]{2,1};
        int[] inorder = new int[]{1,2};
       TreeNode node =  buildTree(preorder,inorder);
        System.out.println(node);
    }


    private static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length) return null;
        return f (preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }

    private static TreeNode f(int[] pre, int L1, int R1, int[] in, int L2, int R2) {
        if (L1 > R1) return null;

        TreeNode node = new TreeNode(pre[L1]);
        if (L1 == R1) return node;

        int index = L2;
        for(;index < in.length && in[index] != pre[L1];index++) {}

        node.left = f(pre,L1+1,L1+index-L2,in,L2,index-1);
        node.right = f(pre,L1+index-L2+1,R1,in,index+1,R2);
        return node;
    }

    private static TreeNode constructTree() {
        TreeNode rootNode = new TreeNode(3);
        rootNode.left = new TreeNode(9);
        rootNode.right = new TreeNode(20);
        rootNode.right.left = new TreeNode(15);
        rootNode.right.right = new TreeNode(7);
        return rootNode;
    }

}
