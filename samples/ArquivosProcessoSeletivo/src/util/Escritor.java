package util;

import model.Curso;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Escritor {

    private String filename;

    public Escritor(String filename) {
        this.filename = filename;
    }

    public void escrever(Lista<Curso> cursos) throws IOException {
        // encontrando o arquivo
        File file = new File("");
        String basePath = file.getAbsolutePath();
        String path = basePath + File.separator + filename + ".txt";

        String aux = "";

        for(int i = 0; i < cursos.size(); i++) {
            aux += cursos.get(i).toString() + "\n";
        }

        // escreva, crie o arquivo se necessario, se existir, substitua
        Files.writeString(Path.of(path), aux, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }
}
