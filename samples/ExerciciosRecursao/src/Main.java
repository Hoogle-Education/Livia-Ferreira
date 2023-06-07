import problems.MDC;
import problems.MudaBase;
import problems.Potencia;
import problems.SomaIntervalo;

public class Main {
    public static void main(String[] args) {
        System.out.println(Potencia.potencia(2, 10));
        System.out.println(SomaIntervalo.soma(1, 100));
        System.out.println(MDC.mdc(10, 6));
        System.out.println(MudaBase.mudaParaBase2(8));
    }
}

// caso base: n == 1: return 1
// soma(n) = n + soma(n-1)

// quero = tudo - naoQuero
// (m -> n) = (1 -> n) - (1 -> n-1)

// caso base: m == n: return m
// soma(a, b) = b + soma(a, b-1)
// soma(a, b) = a + soma(a+1, b)

// soma(4,7) = 7 + soma(4,6)
// soma(4,6) = 6 + soma(4,5)
// soma(4,5) = 5 + soma(4,4)
// soma(4,4) = 4
