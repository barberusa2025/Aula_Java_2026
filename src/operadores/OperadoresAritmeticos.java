package operadores;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        double pao = 9.50;
        double queijo = 7.00;
        double acucar = 1.00;
        double desconto = 5;
        int totalDiasDoMes = 30;

        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalDivididoPorDois = valorTotalComDesconto / 2;
        double valorTotalMensal = valorTotalComDesconto * totalDiasDoMes ;

        System.out.println("Valor total: R$" + valorTotal);
        System.out.println("Valor total com desconto: R$" + valorTotalComDesconto);
        System.out.println("Valor total divido por dois: R$" + valorTotalDivididoPorDois);
        System.out.println("Valor total do mês: R$" + valorTotalMensal);
        ;

    }
}
