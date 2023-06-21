public class HashTable {
    private Integer[] containers;
    private int capacidade;
    private int tamanho;

    public HashTable(int capacidade) {
        this.capacidade = capacidade;
        this.containers = new Integer[capacidade];
        this.tamanho = 0;

        for(int i = 0; i < capacidade; i++) {
            containers[i] = null;
        }
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getTamanho() {
        return tamanho;
    }

    // esta funcao esta simplificado no hash
    // pois o hash de um numero eh ele mesmo
    private int hash(int chave) {
        return chave;
    }

    private int hashLinear(int chave, int i) {
        return (hash(chave) + i) % capacidade;
    }

    private int hashQuadratico(int chave, int i) {
        int c1 = 1, c2 = 3;
        return (hash(chave) + c1 * i + c2 * (i * i)) % capacidade;
    }

    private int hashDuplo(int chave, int i) {
        // 5 6
        // 0 1 2 3 4 5
        int h1 = chave % capacidade;
        // pode ser que seja legal testar outros valores
        // de subtracao no h2 para forcar em "pulo quebrado"
        // pela minha tabela e passar por todos numeros
        int h2 = 1 + (chave % (capacidade - 1));
        return (h1 + i * h2) % capacidade;
    }

    public int pesquisar(int chave) {
       int pos;

       for(int i = 0; i < capacidade; i++) {
           pos = hashLinear(chave, i);

           // se o container na pos esta vazio
           // nao irei encontrar o que estou buscando
           // nele e em um subsequente
           if(containers[pos] == null)
               break;

           if(containers[pos] == chave) {
               return pos;
           }
       }

       return -1;
    }

    public void adicionar(int chave) {
        // TODO
    }

//    abc => 0 => 2 => 4
//    bcd => 2


}
