public class BinaryTree<E extends Comparable<E>> {
    private class Node {

    E data;
    Node left, right;
    Node(E data) {
        this.data = data;
    }
    }
    private Node root;

    public void insert(E value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node node, E value) {
        if (node == null) return new Node(value);

        if (value.compareTo(node.data) < 0)
            node.left = insertRec(node.left, value);
        else
            node.right = insertRec(node.right, value);

        return node;
    }

    public E search(E value) {
        return searchRec(root, value);
    }

    private E searchRec(Node node, E value) {
        if (node == null) return null;

        if (value.compareTo(node.data) == 0)
            return node.data;

        if (value.compareTo(node.data) < 0)
            return searchRec(node.left, value);
        else
            return searchRec(node.right, value);
    }

    public void inOrder() {
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(Node node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.print(node.data + " ");
            inOrderRec(node.right);
        }
    }
}
