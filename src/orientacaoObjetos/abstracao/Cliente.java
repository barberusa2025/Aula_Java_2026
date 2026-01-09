package orientacaoObjetos.abstracao;

public class Cliente extends Endereco implements Pessoa {
    private String nome;
    private String documento;

    public Cliente(String rua, String estado, String cidade, String cep,
                   String nome, String documento) {
        super(rua, estado, cidade, cep);
        this.nome = nome;
        this.documento = documento;
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

    @Override
    public void mostrarEndereco() {
        System.out.println("Endereco do Cliente:\n" + "Rua: " + getRua() + " \nCidade: " + getCidade() + " \nEstado: " +
                getEstado() + " \nCep: " + getCep());

    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                '}';
    }
}
