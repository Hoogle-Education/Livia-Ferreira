package model;

public class TreeNode<T extends Comparable<T>> {
    public T value;
    public TreeNode<T> left;
    public TreeNode<T> right;

    public TreeNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public boolean hasLeft() {
        return left!=null;
    }

    public boolean hasRight() {
        return right!=null;
    }
}
