package excecoesEmJava.excecaoVerificada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDocumentos {

    static void main() {

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(
                    new FileReader(
                            "/Volumes/onn 500GB/FullStack Javanauta " +
                                    "/Javanauta/docs/Hello.txt"));

            String linha;
            while((linha = bufferedReader.readLine()) != null){
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo" + e.getMessage());

            throw new RuntimeException(e);
        }





    }
}
