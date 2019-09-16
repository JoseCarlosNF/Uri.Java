import java.io.IOException;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException {

        // Instanciando objeto para receber entradas 🧱
        Scanner scan = new Scanner(System.in);

        int valorA = scan.nextInt();
        int valorB = scan.nextInt();
        int soma = valorA + valorB;

        // Apresentação 👀
        System.out.printf("SOMA = %d%n", soma);
    }
}