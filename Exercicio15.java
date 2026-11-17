package guiaDidaticoPT3;

import java.util.Scanner;

public class Exercicio15 {

    static float calcularIMC(float peso, float altura) {
        return peso / (altura * altura);
    }

    static void resultado(float imc) {
        String mensagem;

        if (imc < 18.5) {
            mensagem = "Magreza";
        } else if (imc < 25) {
            mensagem = "Normal";
        } else if (imc < 30) {
            mensagem = "Sobrepeso";
        } else if (imc < 35) {
            mensagem = "Obesidade I";
        } else if (imc < 40) {
            mensagem = "Obesidade II";
        } else {
            mensagem = "Obesidade III";
        }

        System.out.printf("IMC: %.2f%n", imc);
        System.out.println("Classificação: " + mensagem);
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float peso, altura;

        System.out.print("Digite o peso: ");
        peso = ler.nextFloat();

        System.out.print("Digite a altura: ");
        altura = ler.nextFloat();

        resultado(calcularIMC(peso, altura));

        ler.close();
    }
}