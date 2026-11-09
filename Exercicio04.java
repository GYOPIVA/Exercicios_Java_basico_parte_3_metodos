package guiaDidaticoPT3;

import java.util.Scanner;

public class Exercicio04 {

    static boolean ehPositivo(int numero){
        if (numero < 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero para verificar se é positivo ou negativo:");
        int numero = input.nextInt();
        System.out.println("Numero positivo?: " + ehPositivo(numero));
    }
}
