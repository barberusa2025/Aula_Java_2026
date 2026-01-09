package arrays;

import java.util.ArrayList;
import java.util.List;

public class EstudoArrayList {

    public static void main(String[] args) {

        // Array list nao precisa declarar o tamanho.
        // Pode acrescentar elementos a qualquer momento.
        List<String> listaDeCompras = new ArrayList<>();

        listaDeCompras.add("Macarrão");
        listaDeCompras.add("Feijão");
        listaDeCompras.add("Arroz");

        System.out.println("Imprimir lista em array format: " + listaDeCompras);
        System.out.println();

        // adiciona banana na posição 1 da lista
        listaDeCompras.add(1, "Banana");

        for(String item : listaDeCompras) {
            System.out.println(item);
        }

      // mostrando item da lista
      System.out.println();
      String item = listaDeCompras.get(0);
      System.out.println("Na posicao 0 da lista: " + item);
      System.out.println();

      //removendo item da lista
      System.out.println("lista de compras original: " + listaDeCompras);
      listaDeCompras.remove(1);
      System.out.println("lista atualizada apos remocao: " + listaDeCompras);
      System.out.println();

      boolean eVazia = listaDeCompras.isEmpty();
      System.out.println("Lista esta vazia?: " + eVazia);
      System.out.println();

      // tamanho da lista
      int tamanhoLista = listaDeCompras.size();
      System.out.println("Tamanho da lista: " + tamanhoLista);
      System.out.println();

      // verificar se a list contem um elemento
      boolean contem = listaDeCompras.contains("Arroz");
      System.out.println("Lista contem arroz?: " + contem);
      System.out.println();

      // Organizar lista em ordem alfabetica / crescenteSystem.out.println("Lista original: " + listaDeCompras);
      listaDeCompras.sort(null);
      System.out.println("Lista ordenada: " + listaDeCompras);
      System.out.println();


      // for each
      listaDeCompras.forEach(produto -> System.out.println(produto));


      //limpar lista
        listaDeCompras.clear();
        System.out.println("Lista limpa: " + listaDeCompras);
        System.out.println();
      }

    }

