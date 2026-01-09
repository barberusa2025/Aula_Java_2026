package orientacaoObjetos.associacao.funcionarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static void main() {
        Funcionarios andrew = new Funcionarios("Andrew");
        Funcionarios joana = new Funcionarios("Joana");
        Funcionarios mateus = new Funcionarios("Mateus");

        List<Funcionarios> listaDeFuncionarios = new ArrayList<>();
        listaDeFuncionarios.add(andrew);
        listaDeFuncionarios.add(joana);
        listaDeFuncionarios.add(mateus);

        Departamento javaDev = new Departamento("Senior Java Developer", listaDeFuncionarios);
        javaDev.mostrarFuncionarios();
        System.out.println("***************");

        Departamento marketing = new Departamento("Marketing", Collections.emptyList());
        marketing.mostrarFuncionarios();
    }
}
