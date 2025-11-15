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

        // double result=square(3);
        // System.out.println(result);

        System.out.println(square(3));

        // double result=cube(3);
        // System.out.println(result);

        System.out.println(cube(3));

        String FullName = getFullName("Spongebob", "Squarepants");
        System.out.println(FullName);

        int age = 21;

        if (AgeCheck(age)) {
            System.out.println("You may sign up!");
        } else {
            System.out.println("You must be 18+ to sign up!");
        }

    }

    // Method Way for Birthday
    static void HappyBirtday() {

        int age = 20;
        String name = "Movic";

        System.out.printf("Happy Birtday to %s!\n", name);
        System.out.printf("Happy Birthday Friend! now you are %d years old\n", age);
        System.out.println("Lalalalalala...");
        System.out.println("Cihuy Acumalaka\n");
    }

    // Method Way with Parameter for Birtday
    static void HappyBirtday2(String BirthDayMan, int NewAge) {

        System.out.printf("Happy Birtday to %s!\n", BirthDayMan);
        System.out.printf("Happy Birthday Friend! now you are %d years old\n", NewAge);
        System.out.println("Now you are Senior!");
        System.out.println("Good job!\n");

    }

    // Method Square Numbers

    static double square(double number) {
        return number * number;
    }

    // Method Cube

    static double cube(double number) {
        return number * number * number;
    }

    // Method FullName

    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    // Method AgeCheck

    static boolean AgeCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
