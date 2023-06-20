import java.io.IOException;

import util.Leitor;

public class Main {
    public static void main(String[] args) {
        var leitor = new Leitor();
        try {
            leitor.ler("entrada");
            leitor.getCursos().forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}