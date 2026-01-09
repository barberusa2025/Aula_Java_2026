package entradaSaidaDeDados;

import java.util.Scanner;

public class EntradaSaidaDeDados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Voce esta empregado? true ou false: ");
        boolean empregadoAtualmente = scanner.nextBoolean();

        System.out.println(nome + " tem " + idade + " anos.");
        System.out.println("Empregado atualmente?: " + empregadoAtualmente);

        scanner.close();

    }
}
