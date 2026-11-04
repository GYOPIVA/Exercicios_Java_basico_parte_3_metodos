package guiaDidaticoPT3;

import java.util.Scanner;

public class Exercicio07 {

    static float quadrado(float lado){
        return lado*lado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a altura do quadrado em cm²: ");
        int quadradoMedida = sc.nextInt();
        System.out.printf("Area do quadrado: %.1fcm²", quadrado(quadradoMedida));
    }
}
