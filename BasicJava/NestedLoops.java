package BasicJava;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        // Nested Loops = A loops inside another loops
        // Used often with mactrices or DS&A

        // Nested Loops Way
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Manual way
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
        }

        // Mini Practice
        int rows;
        int columns;
        char symbols;

        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Input how many rows do u need : ");
        rows = sc.nextInt();

        System.out.print("Input how many columns do u need : ");
        columns = sc.nextInt();

        System.out.print("Input your Symbols : ");
        symbols = sc.next().charAt(0);

        //Outer Loops = Rows
        //Inner Loops = Columns

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbols);
            }
            System.out.println();
        }

        sc.close();
    }
}
// Nested While Loops?