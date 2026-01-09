package conversaoDeTipos;

public class ConversaoDeTipos {

    public static void main(String[] args) {
        // Exemplo de conversão int para double
        int numero = 10;
        double d = numero;
        System.out.println(d); // int convertido para double

        // Exemplo de conversão double para int
        double d2 = 10.5;
        int int2 = (int) d2;
        System.out.println(int2); // double convertido para int

        // Exemplo de conversão int para string
        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString();
        System.out.println(numeroString); // int convertido para string

        // Exemplo de conversao double para string
        Double numeroDouble = 10.0;
        String stringDouble = numeroDouble.toString();
        System.out.println(stringDouble); // double convertido para string

        // Exemplo de conversao long para string
        Long numeroLong = 10L;
        String numeroStringLong = numeroLong.toString();
        System.out.println(numeroStringLong); // long convertido para stringx

        // Exemplo de conversao string para int
        String numeroString2 = "1234";
        Integer numeroConvertido = Integer.parseInt(numeroString2);
        System.out.println(numeroConvertido); // string convertido para int

    }
}
