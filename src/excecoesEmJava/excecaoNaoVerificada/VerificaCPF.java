package excecoesEmJava.excecaoNaoVerificada;

import java.util.Scanner;

public class VerificaCPF {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu CPF: ");
        String verificaCPF = verificaCPF(scanner.nextLine());

        System.out.println(verificaCPF);

    }


    /**
     * Validates CPF; throws exception if already registered
     */
    public static String verificaCPF(String cpf) {

        try {
            if(cpf.equals("0001234500045")){
                throw new RuntimeException("CPF ja cadastrador " + cpf);
            }
            else {
                return "CPF valido, usuario cadastrado";
            }

        } catch (RuntimeException e) {
            throw new RuntimeException("CPF ja cadastrado " + cpf);
        }


    }
}
