import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws IOException{

        // Instanciando Scanner 🧱 
        Scanner scan = new Scanner(System.in);

        // Entradas 💾 
        float nota_1 = scan.nextFloat();
            // nota_1 *= 2;
        float nota_2 = scan.nextFloat();
            // nota_2 *= 3;
        float nota_3 = scan.nextFloat();
            // nota_3 *= 5;

        // Logica 🧠 
        float media = (nota_1 + nota_2 + nota_3) / 10;

        // Apresentação 👀 
        System.out.printf("MEDIA = %.1f%n", media);
        scan.close();
    }
}