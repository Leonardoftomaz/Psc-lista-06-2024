import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUMERO_DE_ALUNOS = 10;
        double[] notas = new double[4];
        double media;
        int contador = 0;

        for (int i = 0; i < NUMERO_DE_ALUNOS; i++) {
            System.out.println("Digite as notas do aluno " + (i + 1));
            for (int j = 0; j < notas.length; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[j] = scanner.nextDouble();
            }

            media = calcularMedia(notas);

            if (media >= 7.0) {
                contador++;
            }

            System.out.printf("A média do aluno %d é: %.2f%n%n", (i + 1), media);
        }

        System.out.println("Há " + contador + " alunos com média de notas 7.0 ou superior.");

        scanner.close();
    }

    private static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
