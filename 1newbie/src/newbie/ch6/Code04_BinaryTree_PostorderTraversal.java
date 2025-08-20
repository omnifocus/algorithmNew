package newbie.ch6;

/**
 * A
 * /   \
 * B     C
 * / \   / \
 * D   E F   G
 * <p>
 * Preorder → "Root First"
 * <p>
 * Inorder → "Root in the Middle"
 * <p>
 * Postorder → "Root Last"
 */
public class Code04_BinaryTree_PostorderTraversal {

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
        traverse_Postorder(rootNode, 0);
    }

    private static void traverse_Postorder(Node<String> rootNode, int level) {
        if (rootNode != null) {
            traverse_Postorder(rootNode.left, level + 1);
            traverse_Postorder(rootNode.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("\t");
            }
            System.out.println(rootNode.v);
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
