package arrays;

public class Arrays {

    public static void main(String[] args) {
        String[] frutas = {"banana", "maca", "laranja", "morango"};

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta [" + i + "]: " + frutas[i]);
        }

        System.out.println("***********");

        double[] salarios = new double[5];
        salarios[0] = 1000.00;
        salarios[1] = 2000.00;
        salarios[2] = 3000.00;
        salarios[3] = 4000.00;
        salarios[4] = 5000.00;

        for (int i = 0; i < salarios.length; i++) {
            System.out.println("Salario [" + i + "] = " + salarios[i]);
        }

    }
}
