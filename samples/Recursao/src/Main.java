public class Main {

    public static void main(String[] args) {
        System.out.println("Resultado iterativo: " + Soma.iterativa(6));
        System.out.println("Resultado recursivo: " + Soma.recursiva(6));
        System.out.println("Fibonacci: " + Fibonacci.recursivo(5));
        // 0, 1, 1, 2, 3, 5

        double start = System.nanoTime();
        int result = Fibonacci.recursivo(30);
        double end = System.nanoTime();
        double delta = end - start;

        System.out.println("Result: " + result);
        System.out.println("Time: " + delta);
    }
}