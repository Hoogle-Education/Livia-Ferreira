package model;

public class Tree<T extends Comparable<T>> {

    private TreeNode<T> root;

    public boolean isEmpty() {
        return root == null;
    }

    public void add(T element) {
        var nodeToAdd = new TreeNode(element);

        if(isEmpty()) {
            root = nodeToAdd;
            return;
        }

        add(element, root);
    }

    private void add(T element, TreeNode<T> node) {
        // case base
        if(node == null) {
            node = new TreeNode(element);
        }

        // funcao recursiva
    }
}
