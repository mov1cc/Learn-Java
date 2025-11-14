package BasicJava;
import java.util.Scanner;

public class userInput1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = scanner.nextLine();
        String name2 = scanner.next();
        scanner.nextLine();// membuang sisa kata dan spasi\n agar string di bawah ga otomatis dapat input
                           // sisa
        String name3 = scanner.next();

        System.out.println("Hello " + name);
        System.out.println("Hi " + name2);
        System.out.print("Halo " + name3 + "\n");

        System.out.println("Enter your age: ");

        int age = scanner.nextInt();
        System.out.println("Enter the quantities: ");
        int quantities = scanner.nextInt();
        System.out.println("Enter your absen: ");
        int absen = scanner.nextInt();

        System.out.println("You are " + age + " years old");

        System.out.println("Enter your gpa: ");

        double gpa = scanner.nextDouble();
        System.out.println("Enter your heigt: ");
        double heigt = scanner.nextDouble();
        System.out.println("Enter your weight: ");
        double weight = scanner.nextDouble();

        System.out.println("your gpa is " + gpa);
        System.out.println("The quantities is " + quantities);
        System.out.println("My absen is " + absen);
        System.out.println("My heigt is " + heigt);
        System.out.println("My weight is " + weight);

        System.out.println("Are you a student? (true/false): ");

        boolean isStudent = scanner.nextBoolean();

        System.out.println("Are you a Worker?(true/false): ");

        boolean isWorker = scanner.nextBoolean();

        System.out.println("You are STUDENT: " + isStudent);

        if (isWorker) {
            System.out.println("You are WORKER");
        } else {
            System.out.println("You are NOT WORKER");
        }
        scanner.close();

    }
}