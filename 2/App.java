import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        for (int i = 0; i < 10; i++){
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }
        System.out.println("Números em ordem reversa: ");
        for (int i = 9; i >= 0; i--){
        System.out.println(numeros[i]);
        }
        scanner.close();
    }
}
