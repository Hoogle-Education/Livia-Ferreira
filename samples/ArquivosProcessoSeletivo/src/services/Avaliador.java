package services;

import model.Candidato;
import model.Curso;
import util.Lista;
import util.ListaOrdenavel;

public class Avaliador {

    private Lista<Curso> cursos;

    public Avaliador(Lista<Curso> cursos) {
        this.cursos = cursos;
    }

    public void avaliarNotas(ListaOrdenavel<Candidato> candidatos) {
        candidatos.sort();
        int quantidade = candidatos.size();

        for(int i = 0; i < quantidade; i++) {
            // avaliador tenta por o candidato na primeira opcao
            var candidato = candidatos.get(i);
            int codigoPrimeiraOpcao = candidato.getCodigoPrimeiraOpcao() - 1;
            Curso primeiraOpcao = cursos.get(codigoPrimeiraOpcao);

            primeiraOpcao.adicionarCandidato(candidato);

            if(!candidato.temCurso()){
                // se ainda nao tem curso, tendo por na segunda
                int codigoSegundaOpcao = candidato.getCodigoSegundaOpcao() - 1;
                Curso segundaOpcao = cursos.get(codigoSegundaOpcao);

                segundaOpcao.adicionarCandidato(candidato);
            }
        }
    }

    public Lista<Curso> getCursosPreenchidos() {
        return cursos;
    }
}
