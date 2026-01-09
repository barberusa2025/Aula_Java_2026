package operadores;

public class OperadorTernario {

    public static void main(String[] args) {
        int idade = 12;

        String mensagem = (idade >= 18) ? "Voce e maior de idade" : "Voce e menor de idade";
        System.out.println(mensagem);
    }
}
