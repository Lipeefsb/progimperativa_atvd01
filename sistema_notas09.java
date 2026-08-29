import java.util.Scanner;

public class sistema_notas09 {

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static String determinarSituacao(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public static double calcularMediaGeral(double[] medias) {
        double soma = 0;

        for (double media : medias) {
            soma += media;
        }

        return soma / medias.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int quantidade = scanner.nextInt();

        double[] medias = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Digite a terceira nota: ");
            double nota3 = scanner.nextDouble();

            medias[i] = calcularMedia(nota1, nota2, nota3);

            System.out.println("Média: " + medias[i]);
            System.out.println("Situação: " + determinarSituacao(medias[i]));
        }

        System.out.println("Média geral da turma: " + calcularMediaGeral(medias));

        scanner.close();
    }
}
