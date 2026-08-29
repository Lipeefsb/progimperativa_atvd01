import java.util.Scanner;

public class fatorial_07 {

    public static long calcularFatorial(int numero) {
        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int numero = scanner.nextInt();

        System.out.println("Fatorial: " + calcularFatorial(numero));

        scanner.close();
    }
}
