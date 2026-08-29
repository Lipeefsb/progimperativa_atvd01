import java.util.Scanner;

public class volume_latadeoleo05 {

    public static double calcularVolume(double raio, double altura) {
        return 3.14159 * raio * raio * altura;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da lata em metros: ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a altura da lata em metros: ");
        double altura = scanner.nextDouble();

        System.out.println("Volume da lata: " + calcularVolume(raio, altura) + " m³");

        scanner.close();
    }
}
