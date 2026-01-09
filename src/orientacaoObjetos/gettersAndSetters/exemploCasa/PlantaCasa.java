package orientacaoObjetos.gettersAndSetters.exemploCasa;

public class PlantaCasa implements Construcao {

    // Atributos
    public double metragem;
    public int numeroDeQuartos;
    public int numberoDeBanheiros;
    public String cor;
    public String material;


    // Metodo construir
    @Override
    public void construir() {
        System.out.println();
        System.out.println("A casa foi construida, as caracteristicas sao: ");
        System.out.println("Metragem: " + metragem);
        System.out.println("Numero de quartos: " + numeroDeQuartos);
        System.out.println("Numero de banheiros: " + numberoDeBanheiros);
        System.out.println("Material: " + material);
    }

    // Anotacao
    @Override
    public void pintar(String cor) {
        System.out.println("Pintando a casa com a cor: " + cor);

    }

    @Override
    public double calcularCustoConstrucao(int custoPorMetro) {
        return metragem * custoPorMetro;
    }


    // Metodo pintar
    public void pintar() {
        System.out.println("A casa foi pintada de " + cor);
    }


    // Metodo mudarCorParede
    public void mudarCorParede(String novaCor) {
        cor = novaCor;
        pintar();
    }


    // Metodo somarMetragem
    public double somarMetragem() {
        return metragem * numberoDeBanheiros + numeroDeQuartos;

    }


    // Metodo alterarCaracteristicas
    public void alterarCaracteristicas(double metros, int quartos, int banheiro, String mat) {
        metragem = metros;
        numeroDeQuartos = quartos;
        numberoDeBanheiros = banheiro;
        material = mat;
        construir();
    }


}
