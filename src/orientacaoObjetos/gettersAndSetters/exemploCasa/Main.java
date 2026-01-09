package orientacaoObjetos.gettersAndSetters.exemploCasa;

public class Main {

    static void main() {
        // Criando o objeto casa
        PlantaCasa casa = new PlantaCasa();


        // Inicializando os atributos (variaveis / caracteristicas da casa)
        casa.numberoDeBanheiros = 2;
        casa.numeroDeQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Cinza";


        // Criando o objeto casaVizinho
        PlantaCasa casaVizinho = new PlantaCasa();

        // Inicializando os atributos (variaveis / caracteristicas da casa vizinha)
        casaVizinho.numberoDeBanheiros = 1;
        casaVizinho.numeroDeQuartos = 2;
        casaVizinho.metragem = 50;
        casaVizinho.material = "Madeira";
        casaVizinho.cor = "Amarelo";


        // Chamando os metodos da casa
        casa.construir();
        casa.pintar();
        casa.mudarCorParede("Branco");
        System.out.println( "A casa tem " + casa.somarMetragem() + " metros quadrados");
        casa.alterarCaracteristicas(80, 3, 2, "Madeira");


        // Chamando os metodos da casaVizinho
        casaVizinho.construir();
        casaVizinho.pintar();
        System.out.println( "A casa tem " + casaVizinho.somarMetragem() + " metros quadrados");

    }
}
