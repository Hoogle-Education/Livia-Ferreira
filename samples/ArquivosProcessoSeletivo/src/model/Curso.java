package model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int codigo;
    private String nome;
    private int numeroDeVagas;
    private List<Candidato> selecionados;
    private List<Candidato> filaDeEspera;

    public Curso(int codigo, String nome, int numeroDeVagas) {
        this.codigo = codigo;
        this.nome = nome;
        this.numeroDeVagas = numeroDeVagas;
        this.selecionados = new ArrayList<>();
        this.filaDeEspera = new ArrayList<>();
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

    public List<Candidato> getSelecionados() {
        return selecionados;
    }

    public void adicionarSelecionado(Candidato candidato) {
        // wrapper method
        this.selecionados.add(candidato);
    }

    public void removerSelecionado(Candidato candidato) {
        this.selecionados.remove(candidato);
    }

    public List<Candidato> getFilaDeEspera() {
        return filaDeEspera;
    }

    public void adicionarFilaDeEspera(Candidato candidato) {
        // wrapper method
        this.filaDeEspera.add(candidato);
    }

    public void removerFilaDeEspera(Candidato candidato) {
        this.filaDeEspera.remove(candidato);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", numeroDeVagas=" + numeroDeVagas +
                '}';
    }
}
