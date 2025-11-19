
import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // int age=18;
        // int age=50;
        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your Name: ");

        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a Student?(true or false): ");
        isStudent = scanner.nextBoolean();

        // GROUP 1
        if (name.isEmpty()) {
            System.out.println("You are Not Enter your name 💩");
        } else {
            System.out.println("Hello " + name + "!");
        }
        // GROUP 2
        // if(age>=18){
        // System.out.println("You are Adult");
        // }

        // if(age>=18){
        // System.out.println("You are Adult");
        // }
        // else{
        // System.out.println("You are Child");
        // }
        if (age >= 60) {
            System.out.println("You are senior! 👴");
        } else if (age >= 18) {
            System.out.println("You are Adult 👨");
        } else if (age == 0) {
            System.out.println("You are baby 👶");
        } else if (age < 0) {
            System.out.println("You are NOT Born");
        } else {
            System.out.println("You are Child 🧒");
        }
        // GROUP 3
        if (isStudent) {
            System.out.println("You are a Student 🏫");
        } else {
            System.out.println("You are NOT Student 🏢");
        }
        scanner.close();
    }
}
// EMOJI TIDAK MUNCUL PADA OUTPUT ATAU TERGANTIKAN DENGAN SIMBOL TERTENTU
// DIKARENAKAN JAVA MENGGUNAKAN DEFAULT UTF-16.