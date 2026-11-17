package guiaDidaticoPT3;

import java.util.Scanner;

public class Exercicio20 {
    static int contarPares(int[] numeros){
        int quantidade = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0){
                quantidade++;
            }
        }
        return quantidade;
    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Digite um numero: ");
        numeros[0] = input.nextInt();
        for (int i = 1; i < numeros.length - 1; i++) {
            System.out.println("Digite um outro numero: ");
            numeros[i] = input.nextInt();
        }
        System.out.println("Digite o ultimo numero: ");
        numeros[4] = input.nextInt();
        System.out.println("Quantidade de pares: " + contarPares(numeros));
    }
}
