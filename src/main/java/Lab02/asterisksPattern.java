package Lab02;

import java.util.Scanner;

public class asterisksPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        int spaces = rows - 1;
        int asterisks = 1;
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 1; k <= asterisks; k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
            spaces--;
            asterisks += 2;
        }
    }

}
