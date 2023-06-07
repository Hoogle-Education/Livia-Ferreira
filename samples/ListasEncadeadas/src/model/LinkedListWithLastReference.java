package model;

public class LinkedListWithLastReference {

    private Node first;
    private Node last;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        if(isEmpty())
            return 0;

        int count = 1;
        var aux = first;

        while(aux.next != null) {
            aux = aux.next;
            count++;
        }

        return count;
    }

    public int get(int index) throws ArrayIndexOutOfBoundsException {
        if(index >= size()) {
            throw new ArrayIndexOutOfBoundsException("Index maior que o tamanho");
        }

        if(index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index menor que zero");
        }

        var aux = first;
        int currentIndex = 0;

        while(aux.next != null) {
            if(currentIndex == index)
                break;

            aux = aux.next;
            currentIndex++;
        }

        return aux.value;
    }

    public void add(int element) {
        var node = new Node(element);

        if(isEmpty()) {
            first = node;
            last = first;
            return;
        }

        //  lista: 1 -> 2 -> 3 -> 4
        //  antes: f         l
        // depois: f              l
        last.next = node;
        last = last.next;
    }

    public void pop(){
        if(isEmpty())
            return;

        var aux = first;
        while(aux.next == last) {
            aux = aux.next;
        }

        last = aux; // volto para o penultimo
        last.next = null; // descarto o proximo
    }
}
