package problems;

public class SomaIntervalo {
    public static int soma(int n, int m) {
        if(n == m)
            return n;

        return m + soma(n, m-1);
    }
}
