import java.io.IOException;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException {

        // Instanciar entrada 🧱
        Scanner scan = new Scanner(System.in);

        int valor_1 = scan.nextInt();
        int valor_2 = scan.nextInt();
        int produto = valor_1 * valor_2;

        // Apresentação 👀
        System.out.printf("PROD = %d%n", produto);
        scan.close();
    }
}