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

    public Integer pesquisar(int chave) {
       int pos;

       for(int i = 0; i < capacidade; i++) {
           pos = hashDuplo(chave, i);

           if(containers[pos] == null)
               continue;

           if(chave == containers[pos]) {
               return pos;
           }
       }

       return null;
    }

    public Integer adicionar(int chave) {

        // se encontrei o elemento, paro por aqui
        if(pesquisar(chave) != null) {
            return null;
        }

        // se nao tiver encontrado
        int pos;
        for(int i = 0; i < capacidade; i++) {
            pos = hashDuplo(chave, i);
            // passo e vejo se a casa esta disponivel

            // vou inserir na posicao disponivel
            if (containers[pos] == null) {
                containers[pos] = chave;
                return pos;
            }

        }

        // nao encontrei lugar para essa chave
        return null;
    }


    public Integer remover(int chave) {
        int pos;

        for(int i = 0; i < capacidade; i ++) {
            pos = hashDuplo(chave, i);

            if(containers[pos] == null)
                continue;

            // deleto a posicao
            if(chave == containers[pos]) {
                containers[pos] = null;
                return pos;
            }
        }

        // nao foi possivel deletar
        return null;
    }

    public void mostrar() {
        for(int i = 0; i < capacidade; i++) {
            Integer elemento = containers[i];

            System.out.print("[ ");
            if (elemento == null)
                System.out.print("V");
            else
                System.out.print(elemento);

            System.out.print(" ] ");
        }

        System.out.println();
    }
}
