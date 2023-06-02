public class Soma {

    public static int iterativa(int n) { // O(n)
        int acumulador = 0; // 1 / 2

        for(int i=1; i <= n; i++) {
            System.out.println("Acumulador: " + acumulador + " | Numero atual: " + i);
            acumulador += i; // acumulador = acumulador + i;
        } // n

        return acumulador; // 1
    }

    public static int recursiva(int n) { // O(n)
        // (1 -> n) = n + (1 -> n-1)
        System.out.println("Numero atual: " + n);

        // caso base
        if( n == 0 )
            return 0;

        // caso recursivo
        return n + recursiva(n-1);
    }

}
