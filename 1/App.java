import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++){
            System.out.print("digite o número "+(i+1)+":");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("os números são: ");
        for (int i = 0; i < numeros.length; i++){
        System.out.println((i + 1) + ": " + numeros[i]);
    }
    scanner.close();
    }
}
