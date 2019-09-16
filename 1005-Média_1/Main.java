import java.io.IOException;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        Double valor_1 = scan.nextDouble();
            valor_1 = valor_1 * 3.5;

        Double valor_2 = scan.nextDouble();
            valor_2 = valor_2 * 7.5;

        Double media = (valor_1 + valor_2)/11;

        System.out.printf("MEDIA = %.5f%n", media);
        scan.close();
    }
}