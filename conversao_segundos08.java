import java.util.Scanner;

public class conversao_segundos08 {

    public static int calcularHoras(int segundos) {
        return segundos / 3600;
    }

    public static int calcularMinutos(int segundos) {
        return (segundos % 3600) / 60;
    }

    public static int calcularSegundos(int segundos) {
        return segundos % 60;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de segundos: ");
        int segundos = scanner.nextInt();

        System.out.println("Horas: " + calcularHoras(segundos));
        System.out.println("Minutos: " + calcularMinutos(segundos));
        System.out.println("Segundos: " + calcularSegundos(segundos));

        scanner.close();
    }
}
