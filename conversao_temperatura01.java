import java.util.Scanner;

public class conversao_temperatura01 {

    public static double fahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static double kelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double reaumur(double celsius) {
        return celsius * 0.8;
    }

    public static double rankine(double celsius) {
        return celsius * 1.8 + 491.67;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.println("Fahrenheit: " + fahrenheit(celsius));
        System.out.println("Kelvin: " + kelvin(celsius));
        System.out.println("Réaumur: " + reaumur(celsius));
        System.out.println("Rankine: " + rankine(celsius));

        scanner.close();
    }
}