# Recursão

- Refazendo o caminho

> O vetor reserva um bloco contiguo de acordo com o tamnho do tipo e a quantidade de elementos

> Vetores e repetição andam juntos, pois vetores tem tamanhos quaisquer e a repetição me permite repetir quantas vezes for necessário.

## subproblema

- O usuario insere um inteiro n.
- Você calcula a soma de 1 até n
- 1 + 2 + 3 + 4 + 5 + 6

```java
int soma(int n, int[] numeros) {
  int acumulador = 0;

  for(int i=0; i < n; i++) {
    System.out.println("Acumulador: " + acumulador + " | Numero atual: " + numeros[i]);
    acumulador = acumulador + numeros[i];
  }
}
```
