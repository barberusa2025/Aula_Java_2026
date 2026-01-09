package treeMap;

import java.util.TreeMap;

public class EstudoTreeMap {

    public static void main(String[] args) {
        TreeMap<String, Double> notasAlunos = new TreeMap<>();
        notasAlunos.put("Alice", 10.5);
        notasAlunos.put("Mateus", 8.0);
        notasAlunos.put("Maria", 9.9);

        for (String nomeAluno : notasAlunos.keySet()) {
            System.out.println(nomeAluno + " - " + notasAlunos.get(nomeAluno));
        }

        System.out.println();

        System.out.println("Primeiro aluno: " + notasAlunos.firstKey());
        System.out.println("Ultimo aluno: " + notasAlunos.lastKey());

    }

}
