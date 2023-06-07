package problems;

public class MudaBase {

    public static String mudaParaBase2(int n) {
        int quociente = n / 2;
        int resto = n % 2;

        if(quociente == 0)
            return String.valueOf(resto);

        return mudaParaBase2(quociente) + resto;
    }
}
