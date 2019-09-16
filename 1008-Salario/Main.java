import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int employee_number = scan.nextInt();
        int worked_hours = scan.nextInt();
        float amount_per_hour = scan.nextFloat();

        float salary = worked_hours * amount_per_hour;

        System.out.println("NUMBER = " + employee_number);
        System.out.println("SALARY = U$ " + salary);

        scan.close();
    }
}

/*
 ? Read 📖
 * - employee's number: Int;
 * - number, his/her worked hours: Int;
 * - number in a month amount he received per hour: Float.
 
 ? Task 🧮:
 * - Calculate salary of employee;
 * - Print informations.
 *  - employee's number 
 *  - salary calculated
  
 ? Presentation 👀
 * - two decimal places.
 * - Example:
 * NUMBER = 25
 * SALARY = U$ 550.00
 */