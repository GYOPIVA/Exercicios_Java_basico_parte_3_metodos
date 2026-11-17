package guiaDidaticoPT3;

import java.util.Scanner;

public class Exercicio14 {
    static boolean podeVotar(){
        return true;
    }
    static boolean naoVota(){
        return false;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        if (idade > 15){
            System.out.println("Pode votar :" + podeVotar());
        }else {
            System.out.println("Pode votar :" + naoVota());
        }
        ler.close();
    }
}
