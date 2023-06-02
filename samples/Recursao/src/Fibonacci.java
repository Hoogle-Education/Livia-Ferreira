public class Fibonacci {

    // f(n) = f(n-1) + f(n-2)
    // 0, 1, 1, 2, 3

    public static int iterativo(int n) { // n
        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[n-1] + fib[n-2];
        } // n - 2

        return fib[n];
    }

    public static int recursivo(int n) { // 2^n
        if ( n == 0 )
            return 0;

        if ( n == 1 )
            return 1;

        return recursivo(n-1) + recursivo(n-2);
    }
}
