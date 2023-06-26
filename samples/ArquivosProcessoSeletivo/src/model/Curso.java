package model;

import util.Lista;

public class Curso {
    private int codigo;
    private String nome;
    private int numeroDeVagas;
    private Lista<Candidato> selecionados;
    private Lista<Candidato> filaDeEspera;

    public Curso(int codigo, String nome, int numeroDeVagas) {
        this.codigo = codigo;
        this.nome = nome;
        this.numeroDeVagas = numeroDeVagas;
        this.selecionados = new Lista<>();
        this.filaDeEspera = new Lista<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeVagas() {
        return numeroDeVagas;
    }

    public void setNumeroDeVagas(int numeroDeVagas) {
        this.numeroDeVagas = numeroDeVagas;
    }

    public Lista<Candidato> getSelecionados() {
        return selecionados;
    }

    public Lista<Candidato> getFilaDeEspera() {
        return filaDeEspera;
    }

    public void adicionarCandidato(Candidato candidato) {
        if(selecionados.size() != numeroDeVagas) {
            if(!candidato.temCurso()) {
                selecionados.add(candidato);
                candidato.obteuCurso();
            }
        } else {
            filaDeEspera.add(candidato);
            candidato.entrouFilaDeEspera();
        }
    }

    public double getNotaDeCorte() {
        return selecionados.back().getMedia();
    }

    @Override
    public String toString() {
        String notaDeCorte = String.format("%.2f", getNotaDeCorte());
        String aux = nome + ' ' + notaDeCorte + "\n";
        int quantidadeSelecionados = selecionados.size();
        int quantidadeEspera = filaDeEspera.size();

        aux += "Selecionados\n";
        for(int i = 0; i < quantidadeSelecionados; i++) {
            aux += selecionados.get(i).toString() + "\n";
        }

        aux += "Fila de Espera\n";
        for(int i = 0; i < quantidadeEspera; i++) {
            aux += filaDeEspera.get(i).toString() + "\n";
        }

        return aux;
    }
}
