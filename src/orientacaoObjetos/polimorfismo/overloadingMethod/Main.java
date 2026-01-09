package orientacaoObjetos.polimorfismo.overloadingMethod;

public class Main {

    static void main() {

       int sabaoPo = 1;
       int mamao = 2;

       double sabonete = 2.5;
       double arroz = 5.90;

       Integer batata = 6;
       Integer cenoura = 7;
       Integer melancia = 5;

        int soma = Calculadora.somar(sabaoPo, mamao);
        double somaDouble = Calculadora.somar(sabonete, arroz);
        Integer somaInteiro = Calculadora.somar(batata, cenoura, melancia);

        System.out.println("soma int = " + soma);
        System.out.println("soma double = " + somaDouble);
        System.out.println("soma Integer = " + somaInteiro);



    }
}
