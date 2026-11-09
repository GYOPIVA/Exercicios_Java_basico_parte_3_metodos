package guiaDidaticoPT3;

import java.util.Scanner;

public class Exercicio09 {
    static void saudacao(String nome){
        System.out.printf("Bem vindo, %s!", nome);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        saudacao(nome);
        sc.close();
    }
}
