package guiaDidaticoPT3;

import java.util.Scanner;

public class Exercicio12 {
    static double media(float[] notas){
        return (notas[0] + notas[1] + notas[2]) / 3;
    }

    static void main(String[] args) {
        float[] notas = new float[3];
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++){
            System.out.printf("Digite a %s° nota: ", i + 1);
            notas[i] = ler.nextFloat();
            if (notas[i]> 10 || notas[i]<0){
                throw new IllegalStateException("Nota inválida!");
            }
        }
        float media = (float) media(notas);
        System.out.printf("A média das notas é: %.1f", media);
    }
}
