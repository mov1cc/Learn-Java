package BasicJava.Arrays;

import java.util.Scanner;

public class InputUserArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String animals[];
        int size;

        System.out.print("HOW MANY ANIMALS DO U WANT TO INPUT : ");
        size = sc.nextInt();

        animals = new String[size];

        for (int i = 0; i < animals.length; i++) {
            System.out.print("ENTER THE NAME OF ANIMALS : ");
            animals[i] = sc.nextLine();
        }
        /*
         * animals[0] = "Lion";
         * animals[1] = "Sheep";
         * animals[2] = "Snake";
         * animals[3] = "Horse";
         */

        // System.out.println(animals.length);
        // System.out.println(animals[2]);

        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i] + " ");
        }

        sc.close();
    }
}
