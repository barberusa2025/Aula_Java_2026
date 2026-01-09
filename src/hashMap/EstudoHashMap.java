package hashMap;

import java.util.HashMap;
import java.util.Map;

public class EstudoHashMap {

    public static void main(String[] args) {
        HashMap<String, Double> notasAlunos = new HashMap<>();
        notasAlunos.put("Alice", 10.5);
        notasAlunos.put("Mateus", 8.0);
        notasAlunos.put("Maria", 9.9);

        // imprimir todos os alunos e suas notas
        for (String nomeAluno : notasAlunos.keySet()) {
            System.out.println(nomeAluno + " - " + notasAlunos.get(nomeAluno));
        }

        System.out.println();

        // nota da Alice
        double notaAlice = notasAlunos.get("Alice");
        System.out.println("Nota de Alice: " + notaAlice);

        System.out.println();

        for (Map.Entry<String, Double> nomeAluno : notasAlunos.entrySet()) {
            System.out.println(nomeAluno.getKey() + " - " + nomeAluno.getValue());
        }

        System.out.println();

        // tamanho do HashMap
        int tamanhoHashMap = notasAlunos.size();
        System.out.println("Tamanho do HashMap: " + tamanhoHashMap);

        System.out.println();

        // remover um aluno
        System.out.println("notas alunos original: " + notasAlunos);
        notasAlunos.remove("Mateus");
        System.out.println("notas alunos (Mateus removido): " + notasAlunos);


    }
}
