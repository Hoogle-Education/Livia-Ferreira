package util;

public class ListaOrdenavel<T extends Comparable<T>> extends Lista<T> {
    // ela eh uma continuacao da classe Lista, delimitando tipos ordenaveis

    public void sort() {
        int tamanho = size();

        if(tamanho < 2)
            return;

        quickSort(0, tamanho - 1);
    }

    private void quickSort(int esq, int dir) {
        // algoritmo quick sort
        int meio = (esq + dir) / 2;
        int i = esq, j = dir;
        T pivo = get(meio);

        while(i <= j) {
            // compara gracas a interface Comparable
            while(get(i).compareTo(pivo) < 0) i++;
            while(get(j).compareTo(pivo) > 0) j--;

            if(i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }

        if(esq < j) quickSort(esq, j);
        if(i < dir) quickSort(i, dir);
    }

    // metodos auxiliares
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

    private void swap(int pos1, int pos2) {
        if(pos1 < 0 || pos1 >= size())
            return;

        if(pos2 < 0 || pos2 >= size())
            return;

        T valor1 = get(pos1);
        T valor2 = get(pos2);
        replace(pos1, valor2);
        replace(pos2, valor1);
    }

}
