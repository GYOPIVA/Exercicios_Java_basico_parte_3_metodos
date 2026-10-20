package manzanoExerciciosFor;

public class ExercicioJ {

        public static void main(String[] args) {
            int celsius;
            double fahrenheit;

            for (celsius = 10; celsius <= 100; celsius += 10) {
                fahrenheit = (9.0 * celsius + 160) / 5;
                System.out.println(
                        celsius + "°C = " + fahrenheit + "°F"
                );
            }
        }
}

