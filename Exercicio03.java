package guiaDidaticoPT3;

import java.util.Scanner;

public class Exercicio03 {

    static double dobro(double dobrar){
        return dobrar * 2;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero e veja o dobro do valor dele: ");
        double numeroDigito = sc.nextDouble();
        System.out.println(dobro(numeroDigito));
    }
}
