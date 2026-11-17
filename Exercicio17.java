package guiaDidaticoPT3;

public class Exercicio17{

    static int somar(int... valores) {
        int soma = 0;

        for (int valor : valores) {
            soma += valor;
        }

        return soma;
    }

    public static void main(String[] args) {

        System.out.println(somar(10, 20));
        System.out.println(somar(1, 2, 3, 4, 5));
        System.out.println(somar(100));

    }
}

