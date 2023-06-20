package model;

public class Node {

    public int value;
    public int height;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
        this.height = 0;
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
