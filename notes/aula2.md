# Listas

## Pre-listas : Vetores

- Vetores são blocos contíguos de memória
- Vetores são referencias na stack para conteúdos na heap
- stack é um lugar de memória mais caro e restrito
- heap é um lugar de memória maior e livre

### Limitações

- Vetores são homogeneos
- Tem tamanho definido

### Dinamizando o vetor

```java
public class Aluno {

  // tem - atributos
  private String nome;
  private int idade;
  private double altura;
  private double nota;

  public Aluno(String nome, int idade, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

  // faz - metodos
  public void fazerAniversario() {
    idade++;
  }

}
```

### Sem construtor:

```java
Aluno joao = new Aluno();
// estado inseguro
joao.nome = "Joao da Silva";
```

### Com construtor:

```java
Aluno maria = new Aluno("Maria da Silva", 23, 1.75);
```

```java
public class VetorDinamico {

  // atributo
  private int[] vetor;

  public VetorDinamico() {
    vetor = new int[0];
  }

  public void adicionarNoFinal(int elemento) {

    int tamanho = vetor.length;
    int[] copy = new int[tamanho + 1];

    for(int i=0; i<n; i++) {
      copy[i] = vetor[i];
    }

    copy[tamanho] = elemento;
    vetor = copy;
  }

}
```
