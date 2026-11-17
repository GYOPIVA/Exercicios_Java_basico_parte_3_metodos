package guiaDidaticoPT3;

public class Exercicio13 {
    static void converterCelcius(float fahrenheit) {
        float celcius = (fahrenheit - 32) / 1.8f;
        System.out.printf("Celcius: %.2f°C%n", celcius);
    }

    static void main(String[] args) {
        converterCelcius(100);
    }
}
