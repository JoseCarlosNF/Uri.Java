import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        // Entrada dos valores
        Scanner input = new Scanner(System.in);

        // Declaração das variáveis
        int valor1 = input.nextInt();
        int valor2 = input.nextInt();
        int soma = valor1 + valor2;
        
        // Apresentação
        System.out.println("X = " + soma);
        input.close();
    }
}