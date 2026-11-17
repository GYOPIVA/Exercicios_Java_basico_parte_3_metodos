package guiaDidaticoPT3;

public class Exercicio19 {
    public static boolean validarSenha(String senha) {
        if (senha == null) {
            return false;
        }

        if (senha.trim().isEmpty()) {
            return false;
        }


        if (senha.length() < 8) {
            return false;
        }

        return true;
    }

    static void main(String[] args) {
        System.out.println(validarSenha("12345678"));
    }
}
