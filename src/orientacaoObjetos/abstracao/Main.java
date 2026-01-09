package orientacaoObjetos.abstracao;

public class Main {

    public static void main(String[] args) {

        Funcionario joaoPauloDaSilva = new Funcionario("Rua das Flores", "Sao Paulo", "SP",
                "123456", "400", "Joao Paulo da Silva", "123-875-554", "TI");

        
        Cliente joanaAlmeida = new Cliente("Rua das Rosas", "RJ", "Rio de Janeiro",
                "987654-013", "Joana Almeida", "052-575-458");


        System.out.println(joaoPauloDaSilva);
        joaoPauloDaSilva.mostrarEndereco();

        System.out.println("***************");

        System.out.println(joanaAlmeida);
        joanaAlmeida.mostrarEndereco();

    }

}
