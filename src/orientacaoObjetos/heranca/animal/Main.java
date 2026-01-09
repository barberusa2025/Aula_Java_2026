package orientacaoObjetos.heranca.animal;

public class Main {
    static void main() {

        Cachorro caramelo = new Cachorro();
        caramelo.latir();
        caramelo.comer("racao");
        caramelo.beberAgua();
        caramelo.dormir();
        System.out.println("***********");

        Galinha gertrudez = new Galinha();
        gertrudez.ciscar();
        gertrudez.comer("grao de milho");
        gertrudez.beberAgua();
        gertrudez.dormir();
        System.out.println("***********");

    }
}
