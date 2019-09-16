import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        
        // Instanciando obj do tipo Scanner 🧱 
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        int diference = (a*b - c*d);

        System.out.println("DIFERENCA = " + diference);
        scan.close();
    }
}