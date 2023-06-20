package model;

import exceptions.InvalidOperationException;

public class SingleLinkedListImpl implements LinkedList {

    private Node first;
    private Node last;

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        if(isEmpty())
            return 0;

        Node aux = first;
        int count = 1;

        while(aux.next != null) {
            count++;
            aux = aux.next;
        }

        return count;
    }

    @Override
    public void add(int element) {
        Node nodeToAdd = new Node(element);

        if(isEmpty()) {
            first = nodeToAdd;
            last = first;
            return;
        }
        // 1 -> 2 -> 3 -> 4 -> null
        last.next = nodeToAdd;
        last = last.next;
    }

    @Override
    public int pop() throws InvalidOperationException {
        if (isEmpty())
            throw new InvalidOperationException("The list cannot be empty");

        int value;

        if(size() == 1){
            value = first.value;
            first = null;
            last = null;
            return value;
        }

        Node penultimo = first; // 1 -> 2 -> null
        while(penultimo.next.next != null) {
            penultimo = penultimo.next;
        }

        value = last.value;
        penultimo.next = null;
        last = penultimo;
        return value;
    }

    @Override
    public void remove(int index) throws InvalidOperationException {
        if(isEmpty())
            throw new InvalidOperationException("you cannot remove on empty list");

        var size = size();
        if(index < 0 && index >= size)
            throw new InvalidOperationException("index is bigger than the list size");

        if(size == 1){
            first = null;
            last = null;
        }

        int count = 0;
        Node anterior = first;
        while(count != index - 1) {
            anterior = anterior.next;
            count++;
        }

        anterior.next = anterior.next.next;
    }

    @Override
    public void insert(int element, int index) throws InvalidOperationException {
        var size = size();

        if(index < 0 || index > size) {
            throw new InvalidOperationException("index out of range");
        }

        // ! se for o primeiro => tambem eh o ultimo
        if(isEmpty() || index == size) {
            add(element);
        }

        int count = 0;
        Node anterior = first;
        while(count != index - 1) {
            anterior = anterior.next;
            count++;
        }

        // first 1 -> 2 -> 3 -> 4 -> 5
        var after = anterior.next;
        anterior.next = new Node(element);
        anterior.next.next = after;
    }

    @Override
    public String toString() {
        if(isEmpty())
            return "";

        Node aux = first;
        String str = "" + first.value;
        while(aux.next != null) {
            aux = aux.next;
            str += " -> " + aux.value;
        }

        return str;
    }
}
