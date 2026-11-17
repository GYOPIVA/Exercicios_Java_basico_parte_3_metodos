package guiaDidaticoPT3;

public class Exercicio11 {
    static float calcularSubtotal(float valor){
        System.out.println("Subtotal: R$ " + valor);
        return valor;
    }

    static float aplicarDesconto(float valor){
        System.out.println("Desconto 10% aplicado!");
        return valor -= valor*0.1f ;
    }

    static void total(float valor){
        System.out.println("Total: R$ " + valor);
    }

    static void main() {
        float subTotal = calcularSubtotal(1000f);
        total(subTotal);
        subTotal = aplicarDesconto(subTotal);
        total(subTotal);
    }


}
