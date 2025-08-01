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
public class Code02_BinaryTree_PreorderTraversal {

    private static class Node<V> {
        V v;
        Node<V> left;
        Node<V> right;
        Node(V v) {
            this.v = v;
        }

        @Override
        public String toString() {
            return v.toString();
        }
    }

    public static void main(String[] args) {
        Node<String> rootNode = constructTree();
        traverse_Preorder(rootNode,0);
    }

    //TODO
    private static void traverse_Preorder(Node<String> rootNode,int level) {

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
