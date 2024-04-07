import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 caracteres (apenas a primeira letra de cada linha sera lido): ");
        char[] caracteres = new char[10];
        int quantidadeConsoantes = 0;

        for (int i = 0; i < 10; i++) {
            caracteres[i] = scanner.next().charAt(0);
            if (!éVogal(caracteres[i])) {
                quantidadeConsoantes++;
            }
        }

        System.out.println("Número de consoantes: " + quantidadeConsoantes);
        System.out.print("Consoantes: ");
        for (int i = 0; i < 10; i++) {
            if (!éVogal(caracteres[i])) {
                System.out.print(caracteres[i] + " ");
            }
            scanner.close();
        }
    }

    private static boolean éVogal(char c) {
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        for (char vogal : vogais) {
            if (c == vogal) {
                return true;
            }
        }
        return false;
    }
}
