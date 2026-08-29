import java.util.Scanner;

public class caixa_deloja10 {

    public static double calcularTotal(double[] precos) {
        double total = 0;

        for (double preco : precos) {
            total += preco;
        }

        return total;
    }

    public static double determinarDesconto(double total) {
        if (total > 500) {
            return 0.15;
        } else if (total > 200) {
            return 0.10;
        } else {
            return 0;
        }
    }

    public static double calcularValorFinal(double total, double desconto) {
        return total - (total * desconto);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] precos = new double[100];
        int quantidade = 0;
        double preco;

        do {
            System.out.print("Digite o preço do produto ou 0 para finalizar: ");
            preco = scanner.nextDouble();

            if (preco != 0) {
                precos[quantidade] = preco;
                quantidade++;
            }
        } while (preco != 0);

        double[] produtos = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            produtos[i] = precos[i];
        }

        double total = calcularTotal(produtos);
        double desconto = determinarDesconto(total);
        double valorFinal = calcularValorFinal(total, desconto);

        System.out.println("Total da compra: R$ " + total);
        System.out.println("Desconto: " + (desconto * 100) + "%");
        System.out.println("Valor final: R$ " + valorFinal);

        scanner.close();
    }
}