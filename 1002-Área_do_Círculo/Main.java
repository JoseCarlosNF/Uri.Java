import java.io.IOException;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException {

        // Instanciando obj para receber as entradas 🧱
        Scanner entrada = new Scanner(System.in);

        // Entrada 💾
        double raio = entrada.nextDouble();
        double area = 3.14159 * Math.pow(raio, 2);

        // Apresentação 👀
        System.out.printf("A=%.4f%n", area);
        entrada.close();
    }
}