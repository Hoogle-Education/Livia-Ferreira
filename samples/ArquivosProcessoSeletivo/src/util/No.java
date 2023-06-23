package util;

public class No<T> {
    private T valor;
    private No<T> proximo;
    private No<T> anterior;

    public No(T valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public boolean hasProximo() {
        return proximo != null;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public No<T> getAnterior() {
        return anterior;
    }

    public boolean hasAnterior() {
        return anterior != null;
    }

    public void setAnterior(No<T> anterior) {
        this.anterior = anterior;
    }
}
