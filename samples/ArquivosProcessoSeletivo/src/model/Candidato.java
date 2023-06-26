package model;

public class Candidato implements Comparable<Candidato> {
    private String nome;
    private int notaRedacao;
    private int notaMatematica;
    private int notaLinguagens;
    private int codigoPrimeiraOpcao;
    private int codigoSegundaOpcao;
    private boolean curso;
    private boolean filaDeEspera;

    public Candidato(String nome, int notaRedacao, int notaMatematica, int notaLinguagens, int codigoPrimeiraOpcao, int codigoSegundaOpcao) {
        this.nome = nome;
        this.notaRedacao = notaRedacao;
        this.notaMatematica = notaMatematica;
        this.notaLinguagens = notaLinguagens;
        this.codigoPrimeiraOpcao = codigoPrimeiraOpcao;
        this.codigoSegundaOpcao = codigoSegundaOpcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNotaRedacao() {
        return notaRedacao;
    }

    public void setNotaRedacao(int notaRedacao) {
        this.notaRedacao = notaRedacao;
    }

    public int getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(int notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public int getNotaLinguagens() {
        return notaLinguagens;
    }

    public void setNotaLinguagens(int notaLinguagens) {
        this.notaLinguagens = notaLinguagens;
    }

    public int getCodigoPrimeiraOpcao() {
        return codigoPrimeiraOpcao;
    }

    public void setCodigoPrimeiraOpcao(int codigoPrimeiraOpcao) {
        this.codigoPrimeiraOpcao = codigoPrimeiraOpcao;
    }

    public int getCodigoSegundaOpcao() {
        return codigoSegundaOpcao;
    }

    public void setCodigoSegundaOpcao(int codigoSegundaOpcao) {
        this.codigoSegundaOpcao = codigoSegundaOpcao;
    }

    public boolean temCurso() {
        return curso;
    }

    public void obteuCurso() {
        this.curso = true;
    }

    public boolean estaEmFilaDeEspera() {
        return filaDeEspera;
    }

    public void entrouFilaDeEspera() {
        this.filaDeEspera = true;
    }

    public void saiuFilaDeEspera() {
        this.filaDeEspera = false;
    }

    public double getMedia() {
        double somaDasNotas = (notaLinguagens + notaRedacao + notaMatematica);
        return somaDasNotas / 3.0;
    }


    @Override
    public int compareTo(Candidato other) {
        var comparacaoMedia = Double.compare(this.getMedia(), other.getMedia());
        var comparaRedacao = Integer.compare(this.getNotaRedacao(), other.getNotaRedacao());
        var INVERSOR_DE_COMPARACAO = -1;

        if(comparacaoMedia != 0)
            return INVERSOR_DE_COMPARACAO * comparacaoMedia;

        return INVERSOR_DE_COMPARACAO * comparaRedacao;
    }

    @Override
    public String toString() {
        return nome + ' '  + String.format("%.2f", getMedia());
    }

}
