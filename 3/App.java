import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDeNotas = 4;
        int soma = 0;

        for (int i = 1; i <= numeroDeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            int nota = scanner.nextInt();
            soma += nota;
        }
        double media = (double) soma / numeroDeNotas;
        System.out.println("A média é: " + media);
        scanner.close();
    }
}
