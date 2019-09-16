import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String seller_name = scan.next();
        double salary = scan.nextDouble();
        double value = scan.nextDouble();

        double final_salary = salary + (0.15 * value);

        System.out.printf("TOTAL = R$ %.2f%n", final_salary);

        scan.close();
    }
}

/*
 ? Tasks 🧮
 * Calculate final salary (total) 
 * with two decimal places.

 ? Read 💾
 - seller's name;
 - fixed salary;
 - total made by himself/herself in the month.
 * seller receives 15% over all products sold

 ? Presentation 👀
 TOTAL = R$ 684.54
 */