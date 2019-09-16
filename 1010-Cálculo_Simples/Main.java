import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        // Part 1️⃣ 
        String input1 = scan.nextLine();
        String values1[] = input1.split(" ");

        int cod1 = Integer.parseInt(values1[0]);
        int num1 = Integer.parseInt(values1[1]);
        double value1 = Double.parseDouble(values1[2]);

        // Part 2️⃣
        String input2 = scan.nextLine();
        String values2[] = input2.split(" ");

        int cod2 = Integer.parseInt(values2[0]);
        int num2 = Integer.parseInt(values2[1]);
        double value2 = Double.parseDouble(values2[2]);

        // Logical 🧠
        double total = (num1 * value1) + (num2 * value2);

        // Presentation 👀
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        scan.close();
    }
}

/*
 ? Task 🧮 
 * Calcular orçamento

 ? Read 💾 
 * - codigo da peça
 * - quantidade
 * - valor por peça
 
 ? Presentation 👀
 * VALOR A PAGAR: R$ x.xx
 */