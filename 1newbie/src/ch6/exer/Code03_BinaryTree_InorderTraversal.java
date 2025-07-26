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
public class Code03_BinaryTree_InorderTraversal {

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
        traverse_Preorder(rootNode);
    }
    //TODO
    private static void traverse_Preorder(Node<String> rootNode) {

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
