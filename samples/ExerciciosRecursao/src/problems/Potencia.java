package problems;

public class Potencia {
    public static int potencia(int a, int n) {
        // caso base
        if(n == 0)
            return 1;

        // caso recursivo
        return a * potencia(a, n - 1);
    }
}
