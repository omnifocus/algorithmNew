package ch6.exer;

/**
 *         A
 *       /   \
 *      B     C
 *     / \   / \
 *    D   E F   G
 *
 * Preorder → "Root First"
 *
 * Inorder → "Root in the Middle"
 *
 * Postorder → "Root Last"
 */
public class Code03_BinaryTree_InorderTraversal_1 {

    private static class Node<V> {
        V v;
        Node<V> left;
        Node<V> right;
        Node(V v) {
            this.v = v;
        }
    }

    public static void main(String[] args) {
        Node<String> rootNode = constructTree();
        traverse_Preorder(rootNode,0);
    }
    private static void traverse_Preorder(Node<String> rootNode, int level) {
        if (rootNode != null) {
            traverse_Preorder(rootNode.left, level+1);
            for (int i = 0; i < level; i++) {
                System.out.print("\t");
            }
            System.out.println(rootNode.v);
            traverse_Preorder(rootNode.right,level+1);
        }
    }

    private static Node<String> constructTree() {
        Node<String> rootNode = new Node<>("A");
        rootNode.left = new Node<>("B");
        rootNode.right = new Node<>("C");
        rootNode.left.left = new Node<>("D");
        rootNode.left.right = new Node<>("E");
        rootNode.right.left = new Node<>("F");
        rootNode.right.right = new Node<>("G");
        return rootNode;
    }

}
