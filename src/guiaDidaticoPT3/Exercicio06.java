package guiaDidaticoPT3;

import java.util.Scanner;

public class Exercicio06 {

    static void exibirDados(String nome, int idade){
        System.out.printf("Meu nome é %s e tenho %d anos", nome, idade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        exibirDados(nome, idade);
    }
}
