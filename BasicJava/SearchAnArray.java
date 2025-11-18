package BasicJava;

import java.util.Scanner;

public class SearchAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = { 1, 2, 3, 7, 5, 4 };
        String fruits[] = { "apple", "orange", "manggo" };
        String target1;
        System.out.print("INPUT THE NAME OF FRUITS DO U NEED SEARCH IN ARRAY : ");
        target1 = sc.nextLine().toLowerCase();
        int target = 5;
        boolean isFound = false;

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target1)) {
                System.out.println("ELEMENT FOUND AT INDEX : " + i);
                isFound = true;
                break;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println("ELEMENT FOUND AT INDEX : " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("ELEMENT NOT FOUND IN THE ARRAY");
        }
        sc.close();
    }
}
