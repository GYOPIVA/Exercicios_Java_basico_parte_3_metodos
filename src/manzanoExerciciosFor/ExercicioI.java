package manzanoExerciciosFor;

public class ExercicioI {
    static void main() {
        int atual = 1;
        int anterior = 1;

        System.out.println(atual);
        System.out.println(anterior);
        for (int i = 0; i <= 20; i++) {
            int resultado = atual + anterior;
            anterior = atual;
            atual = resultado;
            System.out.println(resultado);
        }
    }



}
