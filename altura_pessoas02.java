 import java.util.Scanner;

public class altura_pessoas02 {

    public static double maiorAltura(double[] alturas) {
        double maior = alturas[0];

        for (int i = 1; i < alturas.length; i++) {
            if (alturas[i] > maior) {
                maior = alturas[i];
            }
        }

        return maior;
    }

    public static double menorAltura(double[] alturas) {
        double menor = alturas[0];

        for (int i = 1; i < alturas.length; i++) {
            if (alturas[i] < menor) {
                menor = alturas[i];
            }
        }

        return menor;
    }

    public static double mediaHomens(double[] alturas, int[] sexos) {
        double soma = 0;
        int quantidade = 0;

        for (int i = 0; i < alturas.length; i++) {
            if (sexos[i] == 2) {
                soma += alturas[i];
                quantidade++;
            }
        }

        if (quantidade > 0) {
    return soma / quantidade;
} else {
    return 0;
}
    }

    public static int quantidadeMulheres(int[] sexos) {
        int quantidade = 0;

        for (int sexo : sexos) {
            if (sexo == 1) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] alturas = new double[10];
        int[] sexos = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            alturas[i] = scanner.nextDouble();

            System.out.print("Digite o sexo (1 = Mulher, 2 = Homem): ");
            sexos[i] = scanner.nextInt();
        }

        System.out.println("Maior altura: " + maiorAltura(alturas));
        System.out.println("Menor altura: " + menorAltura(alturas));
        System.out.println("Média de altura dos homens: " + mediaHomens(alturas, sexos));
        System.out.println("Quantidade de mulheres: " + quantidadeMulheres(sexos));

        scanner.close();
    }
}
