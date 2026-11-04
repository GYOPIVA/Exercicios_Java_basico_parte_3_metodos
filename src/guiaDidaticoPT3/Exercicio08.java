package guiaDidaticoPT3;

import java.util.Scanner;

public class Exercicio08 {

    static int maiorNumero(int numero01, int numero02){
        if(numero01 > numero02){
            return numero01;
        }else {
            return numero02;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[2];
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %d° numero: ", i+1);
            numeros[i] = sc.nextInt();
        }
        System.out.println("O maior numero é: " +maiorNumero(numeros[0], numeros[1]));
        sc.close();
    }
}
