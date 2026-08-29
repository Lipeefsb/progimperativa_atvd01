import java.util.Scanner;

public class media_salarial03 {

    public static double calcularMedia(double[] salarios) {
        double soma = 0;

        for (double salario : salarios) {
            soma += salario;
        }

        return soma / salarios.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de funcionários: ");
        int quantidade = scanner.nextInt();

        double[] salarios = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            salarios[i] = scanner.nextDouble();
        }

        System.out.println("Média salarial: " + calcularMedia(salarios));

        scanner.close();
    }
}