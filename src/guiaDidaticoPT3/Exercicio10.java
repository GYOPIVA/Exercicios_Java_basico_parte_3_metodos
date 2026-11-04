package guiaDidaticoPT3;

import java.util.Scanner;

public class Exercicio10 {

    static String parOuImpar(int numeroDigitado){
        if (numeroDigitado %2 == 0){
            return "O numero é par!";
        }else {
            return "O numero é impar!";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        System.out.println(parOuImpar(numero));
    }
}
