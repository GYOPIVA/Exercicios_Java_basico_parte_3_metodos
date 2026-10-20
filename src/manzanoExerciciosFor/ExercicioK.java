package manzanoExerciciosFor;

public class ExercicioK {

        public static void main(String[] args) {

            for (int numero = 1; numero <= 10; numero += 2) {

                long fatorial = 1;

                for (int i = 1; i <= numero; i++) {
                    fatorial *= i;
                }

                System.out.println(numero + "! = " + fatorial);
            }
        }
    }

