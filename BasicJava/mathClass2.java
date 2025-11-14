package BasicJava;
import java.util.Scanner;

public class mathClass2 {
    public static void main(String[] args) {
        // DEKLARASI VARIABEL
        double a;
        double b;
        double c;
        // MEMBUAT OBJEK SCANNER
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER LENGTH OF THE SIDE A: ");
        a = sc.nextDouble();

        System.out.print("ENTER LENGTH OF THE SIDE B: ");
        b = sc.nextDouble();
        // PERHITUNGAN HYPOTENUSE MENGGUNAKAN RUMUS PYTHAGORAS
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        // OUTPUT HASIL
        System.out.println("The value of Hypotenuse is: " + c);

        sc.close();
    }
}