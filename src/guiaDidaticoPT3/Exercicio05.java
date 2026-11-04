package guiaDidaticoPT3;

import java.util.Scanner;

public class Exercicio05 {


    static int somar(int a, int b){
        return a + b;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numerosDigitados = new int[2];
        for (int i = 0; i < numerosDigitados.length; i++) {
            System.out.printf("Digite o %d° numero para somar: \n", i + 1);
            numerosDigitados[i] = sc.nextInt();
        }
        System.out.println("Resultado: "+ somar(numerosDigitados[0], numerosDigitados[1]));
        sc.close();
    }
}
