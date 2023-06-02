package util;
public class VetorDinamico {

    // atributo
    private int[] vetor;

    public VetorDinamico() {
        vetor = new int[0];
    }

    public int[] getVetor() {
        return vetor;
    }

    public void adicionarNoFinal(int elemento) {

        int tamanho = vetor.length;
        int[] copy = new int[tamanho + 1];

        for(int i=0; i<tamanho; i++) {
            copy[i] = vetor[i];
        }

        copy[tamanho] = elemento;
        vetor = copy;
    }

}
