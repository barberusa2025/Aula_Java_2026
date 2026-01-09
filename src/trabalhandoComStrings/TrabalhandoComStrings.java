package trabalhandoComStrings;

public class TrabalhandoComStrings {

    public static void main(String[] args) {
        String nome1 = "Joana";
        String nome2 = "joana";

        int tamanhoNome1String = nome1.length();
        int tamanhoNome2String = nome1.length();

        boolean saoIguais = nome1.toUpperCase().equals(nome2.toUpperCase());

        System.out.println("Oi," + nome1 + "!");
        System.out.println("Seu nome tem " + tamanhoNome1String + " caracteres.");

        System.out.println("**********");

        System.out.println("Oi," + nome2 + "!");
        System.out.println("Seu nome tem " + tamanhoNome2String + " caracteres.");

        System.out.println("**********");

        System.out.println(nome1 + " = " + nome2 + "?: " + saoIguais);



    }
}
