import java.util.Scanner;

public class PotenciaHorsepower {

    public static double calcularPotencia(double massa, double altura, double tempo) {
        double potenciaWatts = (massa * 9.81 * altura) / tempo;
        return potenciaWatts / 745.6999;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a massa em quilogramas: ");
        double massa = scanner.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o tempo em segundos: ");
        double tempo = scanner.nextDouble();

        System.out.println("Potência necessária: " + calcularPotencia(massa, altura, tempo) + " hp");

        scanner.close();
    }
}