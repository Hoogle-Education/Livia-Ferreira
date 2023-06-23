import model.Candidato;
import model.Curso;
import util.Leitor;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var meuLeitor = new Leitor();
        meuLeitor.ler("entrada");
        meuLeitor.getCandidatos();
    }
}