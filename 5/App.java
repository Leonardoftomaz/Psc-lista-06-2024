import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int[] numerosPares = new int[20];
        int[] numerosImpares = new int[20];
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        System.out.println("Digite 20 inteiros: ");
        for (int i = 0; i < 20; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                numerosPares[quantidadePares] = numeros[i];
                quantidadePares++;
            } else {
                numerosImpares[quantidadeImpares] = numeros[i];
                quantidadeImpares++;
            }
        }

        System.out.println("Números: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nNúmeros pares: ");
        for (int i = 0; i < quantidadePares; i++) {
            System.out.print(numerosPares[i] + " ");
        }

        System.out.println("\nNúmeros ímpares: ");
        for (int i = 0; i < quantidadeImpares; i++) {
            System.out.print(numerosImpares[i] + " ");
        }
        scanner.close();
    }
}
