package BasicJava;

public class Methods {
    public static void main(String[] args) {

        // Method = A block of reusable that is excuted when called()

        // Manual Way

        /*
         * System.out.println("Happy Birtday to you!");
         * System.out.println("Happy Birthday Friend!");
         * System.out.println("Lalalalalala...");
         * System.out.println("Cihuy Acumalaka");
         */

        HappyBirtday();
        HappyBirtday();
        HappyBirtday();

        int age2 = 30;
        String name2 = "Anonymous";

        HappyBirtday2(name2, age2);

    }

    // Method Way
    static void HappyBirtday() {

        int age = 20;
        String name = "Movic";

        System.out.printf("Happy Birtday to %s!\n", name);
        System.out.printf("Happy Birthday Friend! now you are %d years old\n", age);
        System.out.println("Lalalalalala...");
        System.out.println("Cihuy Acumalaka\n");
    }

    // Method Way with Parameter
    static void HappyBirtday2(String BirthDayMan, int NewAge) {

        System.out.printf("Happy Birtday to %s!\n", BirthDayMan);
        System.out.printf("Happy Birthday Friend! now you are %d years old\n", NewAge);
        System.out.println("Now you are Senior!");
        System.out.println("Good job!\n");

    }
}
