package guiaDidaticoPT3;

public class Exercicio18 {

    static void dobrar(final int numero) {

        int resultado = numero * 2;

        System.out.println("Número original: " + numero);
        System.out.println("Dobro: " + resultado);
    }

    public static void main(String[] args) {
        dobrar(10);
    }
}