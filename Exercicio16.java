package guiaDidaticoPT3;

public class Exercicio16 {
    static void imprimir(String texto) {
        System.out.println("Texto: " + texto);
    }

    static void imprimir(int numero) {
        System.out.println("Inteiro: " + numero);
    }

    static void imprimir(double numero) {
        System.out.println("Double: " + numero);
    }

    public static void main(String[] args) {

        imprimir("Olá, Giovany!");
        imprimir(10);
        imprimir(25.75);

    }
}
