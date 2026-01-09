package orientacaoObjetos.encapsulamento.contaBancaria;

public class Agencia {

    static void main() {
        ContaBancaria minhaConta = new ContaBancaria("Andrew", 500);

        minhaConta.setTitular("Andrew Barber");
        minhaConta.setSaldo(minhaConta.getSaldo() + 500);

        String titularConta = minhaConta.getTitular();
        double saldoConta = minhaConta.getSaldo();

        System.out.println("Titular conta = " + titularConta);
        System.out.println("Saldo = $" + saldoConta);

        System.out.println("***********");

        ContaBancaria contaMinhaMae = new ContaBancaria("Maria");
        titularConta = contaMinhaMae.getTitular();
        saldoConta = contaMinhaMae.getSaldo();

        System.out.println("Titular conta = " + titularConta);
        System.out.println("Saldo = $" + saldoConta);



    }
}
