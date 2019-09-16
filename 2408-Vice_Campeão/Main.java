import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String[] array_string = scan.nextLine().split(" ");

        int value_1 = Integer.parseInt(array_string[0]);
        int value_2 = Integer.parseInt(array_string[1]);
        int value_3 = Integer.parseInt(array_string[2]);

        int[] array_integer = {value_1, value_2, value_3};
        Arrays.sort(array_integer);

        int value = array_integer[1];

        System.out.println(value);

        scan.close();
    }
}

/* 
? Tasks 🧮 
    * Get the second highest value in three entries.

? Read 💾 
    * Three integers in sequence, separated by space.

? Presentation 👀 
    Input:
    4 5 6

    Output:
    5
 */