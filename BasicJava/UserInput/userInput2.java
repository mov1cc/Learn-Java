package BasicJava.UserInput;
import java.util.Scanner;

public class userInput2 {
    public static void main(String[] args) {

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Width: ");

        width = scanner.nextDouble();

        System.out.print("Enter Height: ");

        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area + "cm²");

        scanner.close();
    }
}