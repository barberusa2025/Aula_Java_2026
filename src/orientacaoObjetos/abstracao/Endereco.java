package orientacaoObjetos.abstracao;

public abstract class Endereco {
    private String rua;
    private String cidade;
    private String estado;
    private String cep;
    private String numeroCasa;

    public Endereco() {
    }

    public Endereco(String rua, String cidade, String estado, String cep, String numeroCasa) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.numeroCasa = numeroCasa;
    }

    public Endereco(String rua, String estado, String cidade, String cep) {
        this.rua = rua;
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public void mostrarEndereco() {
        System.out.println("Rua: " + rua + ", Cidade: " + cidade + ", Estado: " +
                estado + ", Cep: " + cep);

    }


}
