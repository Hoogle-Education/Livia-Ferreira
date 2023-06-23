package util;

public class Lista<T> {

    private No<T> primeiro;
    private No<T> ultimo;

    public boolean isEmpty() {
        return primeiro == null;
    }

    public int size() {
        if(isEmpty())
            return 0;

        No aux = primeiro;
        int contador = 1;

        while(aux.hasProximo()) {
            aux = aux.getProximo();
            contador++;
        }

        return contador;
    }

    public void add(T valor) {
        No<T> paraAdicionar = new No<T>(valor);

        if (isEmpty()) {
            primeiro = paraAdicionar;
            ultimo = primeiro;
        }

        ultimo.setProximo(paraAdicionar);
        // TODO falta configurar o anterior da lista duplamento encadeada
        ultimo = ultimo.getProximo();
    }

    public T get(int index) {
        if(index < 0 || index >= size())
            return null;

        No<T> aux = primeiro;
        int indexAtual = 0;

        while(indexAtual != index) {
            aux = aux.getProximo();
            indexAtual++;
        }

        return aux.getValor();
    }

    private void replace(int index, T valor) {
        if(index < 0 || index >= size())
            return;

        No<T> aux = primeiro;
        int indexAtual = 0;

        while(indexAtual != index) {
            aux = aux.getProximo();
            indexAtual++;
        }

        aux.setValor(valor);
    }

    public void swap(int pos1, int pos2) {
        if(pos1 < 0 || pos1 >= size())
            return;

        if(pos2 < 0 || pos2 >= size())
            return;

        T valor1 = get(pos1);
        T valor2 = get(pos2);
        replace(pos1, valor2);
        replace(pos2, valor1);
    }

    public boolean remove(T valor) {
        No<T> aux = primeiro;

        // TODO remover a primeira ocorrencia do elemento
        while(aux.hasProximo()) {
            primeiro
        }

    }
}
