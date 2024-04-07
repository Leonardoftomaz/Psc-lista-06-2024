import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        long soma = 0, produto = 1;

        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
            produto *= numeros[i];
        }

        System.out.println("A soma dos números é: " + soma);
        System.out.println("O produto dos números é: " + produto);

        for (int numero : numeros) {
            System.out.println(numero);
        }
        scanner.close();
    }
}