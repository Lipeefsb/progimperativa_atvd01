import java.util.Scanner;

public class estatistica_numeros12 {

    public static int quantidadeNumeros(int[] numeros, int quantidade) {
        return quantidade;
    }

    public static int calcularSoma(int[] numeros, int quantidade) {
        int soma = 0;

        for (int i = 0; i < quantidade; i++) {
            soma += numeros[i];
        }

        return soma;
    }

    public static double calcularMedia(int[] numeros, int quantidade) {
        return (double) calcularSoma(numeros, quantidade) / quantidade;
    }

    public static int maiorNumero(int[] numeros, int quantidade) {
        int maior = numeros[0];

        for (int i = 1; i < quantidade; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        return maior;
    }

    public static int menorNumero(int[] numeros, int quantidade) {
        int menor = numeros[0];

        for (int i = 1; i < quantidade; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        return menor;
    }

    public static int quantidadePares(int[] numeros, int quantidade) {
        int pares = 0;

        for (int i = 0; i < quantidade; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }

        return pares;
    }

    public static int quantidadeImpares(int[] numeros, int quantidade) {
        int impares = 0;

        for (int i = 0; i < quantidade; i++) {
            if (numeros[i] % 2 != 0) {
                impares++;
            }
        }

        return impares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[100];
        int quantidade = 0;
        int numero;

        do {
            System.out.print("Digite um número positivo ou -1 para finalizar: ");
            numero = scanner.nextInt();

            if (numero != -1) {
                numeros[quantidade] = numero;
                quantidade++;
            }
        } while (numero != -1);

        if (quantidade > 0) {
            System.out.println("Quantidade de números: " + quantidadeNumeros(numeros, quantidade));
            System.out.println("Soma: " + calcularSoma(numeros, quantidade));
            System.out.println("Média: " + calcularMedia(numeros, quantidade));
            System.out.println("Maior número: " + maiorNumero(numeros, quantidade));
            System.out.println("Menor número: " + menorNumero(numeros, quantidade));
            System.out.println("Quantidade de pares: " + quantidadePares(numeros, quantidade));
            System.out.println("Quantidade de ímpares: " + quantidadeImpares(numeros, quantidade));
        } else {
            System.out.println("Nenhum número válido foi informado.");
        }

        scanner.close();
    }
}