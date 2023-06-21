public class Main {
    public static void main(String[] args) {
        var table = new HashTable(10);
        table.adicionar(5);
        table.mostrar();
        table.adicionar(15);
        table.mostrar();
        table.adicionar(25);
        table.mostrar();

        table.remover(15);
        table.mostrar();

        if (table.pesquisar(25) == null) {
            System.out.println("nao encontrado");
        } else {
            System.out.println("encontrado");
        }
        table.remover(25);

        table.mostrar();
        if (table.pesquisar(25) == null) {
            System.out.println("nao encontrado");
        } else {
            System.out.println("encontrado");
        }
    }
}