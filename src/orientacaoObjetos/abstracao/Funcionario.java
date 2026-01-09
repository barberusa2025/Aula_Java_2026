package orientacaoObjetos.abstracao;

public class Funcionario extends Endereco implements Pessoa {

    private String nome;
    private String documento;
    private String cargo;

    public Funcionario(String rua, String cidade, String estado, String cep,
                       String numeroCasa, String nome, String documento,
                       String cargo) {
        super(rua, cidade, estado, cep, numeroCasa);
        this.nome = nome;
        this.documento = documento;
        this.cargo = cargo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDocumento() {
        return documento;
    }

    @Override
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void mostrarEndereco() {
        System.out.println("Endereco do funcionario:\n" + "Rua: " + getRua() + " \nnumero: " + getNumeroCasa() +
                " \nCidade: " + getCidade() + " \nEstado: " +
                getEstado() + " \nCep: " + getCep());
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
