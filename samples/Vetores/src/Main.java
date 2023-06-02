import util.VetorDinamico;

public class Main {
    public static void main(String[] args) {
        VetorDinamico meuVetor = new VetorDinamico();

        meuVetor.adicionarNoFinal(2);
        meuVetor.adicionarNoFinal(3);
        meuVetor.adicionarNoFinal(5);
        meuVetor.adicionarNoFinal(4);
        meuVetor.adicionarNoFinal(1);

        // for each - enhanced for - para cada
        for(int element : meuVetor.getVetor()) {
            System.out.println(element);
        }
    }
}