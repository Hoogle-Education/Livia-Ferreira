public class Entry {
    private String chave;
    private String valor;
    private Entry prox;

    public Entry(String chave, String valor) {
        this.chave = chave;
        this.valor = valor;
        this.prox = null;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Entry getProx() {
        return prox;
    }

    public void setProx(Entry prox) {
        this.prox = prox;
    }
}
