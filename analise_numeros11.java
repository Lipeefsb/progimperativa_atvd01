import java.util.Scanner;

public class analise_numeros11 {

    public static int maiorNumero(int[] numeros) {
        int maior = numeros[0];

        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }

        return maior;
    }

    public static int menorNumero(int[] numeros) {
        int menor = numeros[0];

        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }

        return menor;
    }

    public static int quantidadePares(int[] numeros) {
        int quantidade = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static double calcularMedia(int[] numeros) {
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        return (double) soma / numeros.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Maior número: " + maiorNumero(numeros));
        System.out.println("Menor número: " + menorNumero(numeros));
        System.out.println("Quantidade de pares: " + quantidadePares(numeros));
        System.out.println("Média: " + calcularMedia(numeros));

        scanner.close();
    }
}
