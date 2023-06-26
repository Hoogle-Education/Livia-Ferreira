import model.Candidato;
import model.Curso;
import services.Avaliador;
import util.Escritor;
import util.Leitor;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        var meuLeitor = new Leitor();

        try {
            meuLeitor.ler("entrada");
        } catch (IOException e) {
            System.err.println("Erro na leitura do arquivo");
            return;
        }

        var candidatos = meuLeitor.getCandidatos();
        var cursos = meuLeitor.getCursos();

        var avaliador = new Avaliador(cursos);
        avaliador.avaliarNotas(candidatos);

        var escritor = new Escritor("saida");

        try {
            escritor.escrever(cursos);
        } catch (IOException e) {
            System.err.println("Erro ao escrever a saida do programa");
            return;
        }
    }
}