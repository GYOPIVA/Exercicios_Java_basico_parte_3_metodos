package manzanoExerciciosFor;

import java.util.Scanner;

public class ExercicioB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero para ver sua tabuada: ");
        int numero = input.nextInt();
        for (int i = 0; i <= 10; i++) {
            int multiplicacao = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, multiplicacao);
        }
    }
}
