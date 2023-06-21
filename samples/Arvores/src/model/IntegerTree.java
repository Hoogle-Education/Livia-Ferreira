package model;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class IntegerTree {

    private Node root;

    public boolean isEmpty() {
        return root == null;
    }

    int updateHeight(Node node) {
        if(node == null)
            return 0;

        var alturaEsquerda = updateHeight(node.left);
        var alturaDireita = updateHeight(node.right);

        return node.height = 1 + max(alturaEsquerda, alturaDireita);
    }

    private int getBalance(Node node) {
        return (node == null) ? 0 : (updateHeight(node.right) - updateHeight(node.left));
    }

    public void add(int element) {
        if(isEmpty()) {
            root = new Node(element);
            return;
        }

        root = add(element, root);
    }

    private Node add(int element, Node node) {
        // case base
        if(node == null) {
            return new Node(element);
        }

        // caso recursivo
        if(element < node.value) {
            node.left = add(element, node.left);
        } else if(element >= node.value) {
            node.right = add(element, node.right);
        }

        return balance(node);
    }

    public boolean hasValue(int value) {
        if(isEmpty())
            return false;

        return hasValue(value, root);
    }

    private boolean hasValue(int value, Node node) {
        if(node == null)
            return false;

        if(node.value == value)
            return true;

        return (value < node.value) ?
            hasValue(value, node.left) :
            hasValue(value, node.right) ;
    }

    private String getInOrder(Node node) {
        if(node == null)
            return "";

        //caso recursivo
        String left = getInOrder(node.left);
        String middle = "" + node.value;
        String right = getInOrder(node.right);

        return left + middle + right;
    }

    private String getPreOrder(Node node) {
        if(node == null)
            return "";

        //caso recursivo
        String left = getPreOrder(node.left);
        String middle = "" + node.value;
        String right = getPreOrder(node.right);

        return middle + left + right;
    }

    private String getPostOrder(Node node) {
        if(node == null)
            return "";

        //caso recursivo
        String left = getPostOrder(node.left);
        String middle = "" + node.value;
        String right = getPostOrder(node.right);

        return left + right + middle;
    }

    public boolean remove(int value) {
        if(!hasValue(value))
            return false;

        return remove(value, root);
    }

    private boolean remove(int value, Node node) {
        if(node == null)
            return false;

        Node toRemove = null;

        // removemos a esq ou a dir do no que chamou a funcao
        if(node.left.value == value)
            toRemove = node.left;
        else if(node.right.value == value)
            toRemove = node.right;

        if(toRemove != null) {
            var appendFirst = toRemove.right;
            var appendAfter = toRemove.left;

            if(node.left == toRemove)
                node.left = appendFirst;
            else
                node.right = appendFirst;

            var theMostLeft = theMostLeftNodeFrom(node);
            theMostLeft.left = appendAfter;
            return true;
        }


        var resposta = (value < node.value) ?
                remove(value, node.left) :
                remove(value, node.right);

        balance(node);
        return resposta;
    }

    private Node theMostLeftNodeFrom(Node node) {
        if(node.left == null)
            return node;

        return theMostLeftNodeFrom(node.left);
    }

    private Node balance(Node node) {
        if(node == null) {
            return null;
        }

        updateHeight(node);
        int balance = getBalance(node);
        if( abs(balance) <= 1) {
            return node;
        }

        int subBalance;
        if(balance > 1) {
            subBalance = getBalance(node.right);
            if(subBalance > 0)
                node = leftRotation(node);
            else
                node = doubleLeftRotation(node);
        } else {
            subBalance = getBalance(node.left);
            if(subBalance > 0)
                node = rightRotation(node);
            else
                node = doubleRightRotation(node);
        }

        return node;
    }

    public Node leftRotation(Node raiz) {
        Node x = raiz.right;
        Node y = x.left;
        x.left = raiz;
        raiz.right = y;
        updateHeight(raiz);
        updateHeight(x);
        return x;
    }

    public Node rightRotation(Node raiz) {
        Node x = raiz.left;
        Node y = x.right;
        x.right = raiz;
        raiz.left = y;
        updateHeight(raiz);
        updateHeight(x);
        return x;
    }

    public Node doubleLeftRotation(Node raiz) {
        if (raiz == null || raiz.right == null) {
            return raiz; // Adiciona verificação de nulo
        }

        raiz.right = rightRotation(raiz.right);
        raiz = leftRotation(raiz);

        updateHeight(raiz);
        return raiz;
    }

    public Node doubleRightRotation(Node raiz) {
        if (raiz == null || raiz.left == null) {
            return raiz; // Adiciona verificação de nulo
        }

        raiz.left = leftRotation(raiz.left);
        raiz = rightRotation(raiz);

        updateHeight(raiz);
        return raiz;
    }

    @Override
    public String toString() {
       return getInOrder(root);
    }
}
