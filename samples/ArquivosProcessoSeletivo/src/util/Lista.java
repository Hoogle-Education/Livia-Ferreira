package util;

import java.util.ArrayList;
import java.util.List;

public class Lista<T> {
    // generico para que a lista seja reutilizavel

    protected No<T> primeiro;
    protected No<T> ultimo;

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
            return;
        }

        ultimo.setProximo(paraAdicionar);
        paraAdicionar.setAnterior(ultimo);
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

    public T back() {
        if(ultimo == null)
            return null;

        return ultimo.getValor();
    }

    public boolean remove(T valor) {
        No<T> aux = primeiro;
        int tamanho = size();
        boolean encontrei = false;

        if(tamanho == 1 && primeiro.getValor().equals(valor)) {
            this.primeiro = null;
            this.ultimo = null;
            return true;
        }

        while(aux.hasProximo()) {
            if(aux.getProximo().getValor().equals(valor)) {
                encontrei = true;
                break;
            } else aux = aux.getProximo();
        }

        if(!encontrei)
            return false;

        // 1 -> 2 -> 3 -> 4
        aux.setProximo(aux.getProximo().getProximo());
        aux.getProximo().setAnterior(aux);
        return true;
    }

}
