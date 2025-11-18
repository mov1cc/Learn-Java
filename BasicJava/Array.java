package BasicJava;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // A COLLECTION VALUES OF THE SAME DATA TYPE (KUMPULAN NILAI DENGAN TIPE DATA
        // YANG SAMA)
        // *THINK OF IT AS A VARIABLE THAT CAN STORE MORE THAN 1 VALUE (BAYANGKAN SATU
        // VARIABEL DAPAT MENYIMPAN LEBIH DARI SATU NILAI DENGAN TIPE DATA YANG SAMA)

        String fruits[] = { "Banana", "Apple", "Strawberry" };
        // fruits[0]="Pinnaple";
        // int num = fruits.length;
        // Arrays.sort(fruits);
        Arrays.fill(fruits, "Pineapple");

        // System.out.println(fruits[0]);
        // System.out.println(num);

        /*
         * for(int i=0;i<fruits.length;i++){
         * System.out.print(fruits[i]+" ");
         * }
         */

        // ENHANCE FOR LOOP
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
