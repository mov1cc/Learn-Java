package BasicJava;
import java.util.Random;

public class randomNumber {
    public static void main(String[] args) {
        // DEKLARASI VARIABEL RANDOM NUMBERS
        int numbers1;
        int numbers2;
        int numbers3;

        double numbers4;
        double numbers5;
        double numbers6;

        boolean gender;

        //
        Random random = new Random();

        numbers1 = random.nextInt(1, 7);
        numbers2 = random.nextInt(0, 9);
        numbers3 = random.nextInt(0, 9);

        numbers4 = random.nextDouble();
        numbers5 = random.nextDouble();
        numbers6 = random.nextDouble();

        gender = random.nextBoolean();
        // OUTPUT
        System.out.println(numbers1);
        System.out.println(numbers2);
        System.out.println(numbers3);

        System.out.println(numbers4);
        System.out.println(numbers5);
        System.out.println(numbers6);
        // OUTPUT IF-ELSE BOOLEAN
        if (gender) {
            System.out.println("Man");
        } else {
            System.out.println("Woman");
        }

    }
}