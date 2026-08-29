import java.util.Scanner;

public class calc_azuleijos_04 {

    public static int calcularAzulejos(double alturaParede, double larguraParede, double alturaAzulejo, double larguraAzulejo) {
        int quantidadeAltura = (int) (alturaParede / alturaAzulejo);
        int quantidadeLargura = (int) (larguraParede / larguraAzulejo);

        if (alturaParede % alturaAzulejo != 0) {
            quantidadeAltura++;
        }

        if (larguraParede % larguraAzulejo != 0) {
            quantidadeLargura++;
        }

        return quantidadeAltura * quantidadeLargura;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura da parede: ");
        double alturaParede = scanner.nextDouble();

        System.out.print("Digite a largura da parede: ");
        double larguraParede = scanner.nextDouble();

        System.out.print("Digite a altura do azulejo: ");
        double alturaAzulejo = scanner.nextDouble();

        System.out.print("Digite a largura do azulejo: ");
        double larguraAzulejo = scanner.nextDouble();

        System.out.println("Quantidade mínima de azulejos: " +
                calcularAzulejos(alturaParede, larguraParede, alturaAzulejo, larguraAzulejo));

        scanner.close();
    }
}