package model;

public class LinkedListWithoutLastReference {

    private Node first;

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
            return;
        }

        // crio um auxiliar
        var aux = first;

        // caminho por toda a minha lista
        while(aux.next != null) {
            // pulando para o proximo
            aux = aux.next;
        }

        // no final atribuo o prox como o novo node
        aux.next = node;
    }

}
