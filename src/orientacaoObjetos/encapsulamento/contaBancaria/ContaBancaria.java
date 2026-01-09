package orientacaoObjetos.encapsulamento.contaBancaria;

public class ContaBancaria {

    // Construtor com atributos
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Construtor sem atributos
    public ContaBancaria() {

    }

    // Construtor com 1 atributo
    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    // Atributos privados
    private String titular;
    private double saldo;

    // Getter e Setter - Metodos Padroes para acessar e modificar os atributos

    // Metodo para obter o titular da conta
    public String getTitular() {
        return titular;
    }

    // Metodo para alterar o titular da conta
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Metodo para obter o saldo da conta
    public double getSaldo() {
        return saldo;
    }

    // Metodo para alterar o saldo da conta
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
