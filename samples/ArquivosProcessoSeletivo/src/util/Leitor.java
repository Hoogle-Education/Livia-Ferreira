package util;

import model.Candidato;
import model.Curso;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Leitor {

    private int quantidadeCursos;
    private int quantidadeCandidatos;
    private List<Curso> cursos = new ArrayList<>();
    private List<Candidato> candidatos = new ArrayList<>();

    public void ler(String filename) throws IOException {
        // encontrando o arquivo
        File file = new File("");
        String basePath = file.getAbsolutePath();
        String path = basePath + File.separator + filename + ".txt";
        // DEBUG System.out.println("Arquivo: " + path);

        // extrai as linhas do arquivo
        var lines = Files.readAllLines(Path.of(path));

        // extraindo as quantidades
        var quantidades = lines.get(0).split(";"); // ["4" , "8"]
        quantidadeCursos = Integer.parseInt(quantidades[0]);
        quantidadeCandidatos = Integer.parseInt(quantidades[1]);

        // DEBUG System.out.println(quantidadeCandidatos + " candidatos");
        // DEBUG System.out.println(quantidadeCursos + " cursos");

        // logica dos indices
        // [inicio, final)
        // 1 2 3 = [1, 4)

        // extraindo cursos
        int indexInicioCursos = 1;
        int indexFimCursos = quantidadeCursos + indexInicioCursos;
        encontraCursos(lines, indexInicioCursos, indexFimCursos);

        // extraindo candidatos
        int indexInicioCandidatos = indexFimCursos;
        int indexFimCandidatos = quantidadeCandidatos + indexInicioCandidatos;
        encontraCandidatos(lines, indexInicioCandidatos, indexFimCandidatos);
    }

    private void encontraCandidatos(List<String> lines, int inicio, int fim) {
        for (int i = inicio; i < fim; i++) {
            var dados = lines.get(i).split(";");
            // antes [ "Bob Esponja", "600", "700", "800", "1", "2"]
            // depois do parse [ Bob Esponja, 600, 700, 800, 1, 2]
            var candidato = new Candidato (
                    dados[0],
                    Integer.parseInt(dados[1]),
                    Integer.parseInt(dados[2]),
                    Integer.parseInt(dados[3]),
                    Integer.parseInt(dados[4]),
                    Integer.parseInt(dados[5])
            );

            candidatos.add(candidato);
        }
    }

    private void encontraCursos(List<String> lines, int inicio, int fim) {
        for (int i = inicio; i < fim; i++) {
            // DEBUG System.out.println(lines.get(i));
            var dados = lines.get(i).split(";"); // ["3", "Química", "2"]
            var curso = new Curso(
                    Integer.parseInt(dados[0]),
                    dados[1],
                    Integer.parseInt(dados[2]));

            cursos.add(curso);
        }
    }

    public int getQuantidadeCursos() {
        return quantidadeCursos;
    }

    public int getQuantidadeCandidatos() {
        return quantidadeCandidatos;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }
}
