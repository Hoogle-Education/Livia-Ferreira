package model;

public class Candidato {
    private String nome;
    private int notaRedacao;
    private int notaMatematica;
    private int notaLinguagens;
    private int codigoPrimeiraOpcao;
    private int codigoSegundaOpcao;

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

    @Override
    public String toString() {
        return "Candidato{" +
                "nome='" + nome + '\'' +
                ", notaRedacao=" + notaRedacao +
                ", notaMatematica=" + notaMatematica +
                ", notaLinguagens=" + notaLinguagens +
                ", codigoPrimeiraOpcao=" + codigoPrimeiraOpcao +
                ", codigoSegundaOpcao=" + codigoSegundaOpcao +
                '}';
    }
}
