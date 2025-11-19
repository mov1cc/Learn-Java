package BasicJava.Math;

//CIRCUMFERENCE C=2.π.r OR C=π.D
//AREA A=π.r²
//VOLUME V=(4/3).π.r³
import java.util.Scanner;

public class mathClass3 {
    public static void main(String[] args) {
        // HEADLINE
        System.out.println("=========CIRCLE AND SPHERE CALCULATOR========");
        // DEKLARASI VARIABEL DAN DATA TYPE
        double c, r, a, v;
        // SCANNER INPUT RADIUS
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE RADIUS(IN cm): ");
        r = sc.nextDouble();
        // RUMUS MATHS YG BERHUBUNGAN DENGAN LINGKARAN
        c = 2 * Math.PI * r;

        a = Math.PI * Math.pow(r, 2);

        v = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        // OUTPUT
        System.out.printf("THE CIRCUMFERENCE IS: %.2fcm%n", c);
        System.out.printf("THE AREA IS: %.2fcm^2%n", a);
        System.out.printf("THE VOLUME IS: %.2fcm^3%n", v);

        sc.close();
        // PEMBATAS AKHIR
        System.out.println("=============================================");
    }
}