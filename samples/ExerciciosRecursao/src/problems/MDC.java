package problems;

public class MDC {

    public static int mdc(int x, int y) {
        // caso base
        if(x == y)
            return x;

        // caso recursivo
        if(y > x)
            return mdc(y, x);

        // caso recursivo
        return mdc(x-y, y);
    }
}
