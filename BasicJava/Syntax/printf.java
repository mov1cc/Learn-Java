package BasicJava.Syntax;
//PRINTF IS METHOD USE FOR FORMAT OUTPUT
//[FLAGS][WIDTH][.PRECISION][SPECIFIER CHARACTER]
public class printf {
    public static void main(String[] args) {

        String name = "Movic";
        char firstletter = 'M';
        int age = 20;
        double height = 170.0;
        boolean isEmployed = true;

        double a = 20000.678;
        double b = 45000.789;
        double c = -50000.567;

        int d = 2;
        int e = 3;
        int f = 4;
        int g = 5;

        // SPECIFIER CHARARCTER
        System.out.printf("Hello, %s\n", name);
        System.out.printf("The first letter of the name is %c\n", firstletter);
        System.out.printf("His age is %d years old\n", age);
        System.out.printf("His heigt is %fcm\n", height);
        System.out.printf("Is He employed? %b\n", isEmployed);

        System.out.println();
        System.out.printf(
                "Hello my name is %s and my name has a %c in firstletter, i am %d years old, my height is %fcm, and i am %b employed at Google\n",
                name, firstletter, age, height, isEmployed);
        // PRECISION
        System.out.println();
        System.out.printf("%.1f\n", a);
        System.out.printf("%.2f\n", b);
        System.out.printf("%.3f\n", c);
        // FLAG
        // += OUTPUT A PLUS +
        System.out.println();
        System.out.printf("%+.2f\n", a);
        System.out.printf("%+.2f\n", b);
        System.out.printf("%+.2f\n", c);
        // ,=OUTPUT GROUP SEPARATOR
        System.out.println();
        System.out.printf("%,.2f\n", a);
        System.out.printf("%,.2f\n", b);
        System.out.printf("%,.2f\n", c);
        // (=OUTPUT NEGATIVE NUMBERS ARE ENCLOSED IN ()
        System.out.println();
        System.out.printf("%(.2f\n", a);
        System.out.printf("%(.2f\n", b);
        System.out.printf("%(.2f\n", c);
        // SPACE=
        System.out.println();
        System.out.printf("% .2f\n", a);
        System.out.printf("% .2f\n", b);
        System.out.printf("% .2f\n", c);
        // WIDTH
        // 0=ZERO PADDING
        // NUMBER= RIGHT JUSTIFIED PADDING
        // NEGATIVE NUMBER = LEFT JUSTIFIED PADDING
        System.out.println();
        System.out.printf("%04d\n", d);
        System.out.printf("%4d\n", e);
        System.out.printf("%-3d\n", f);
        System.out.printf("%d\n", g);
    }
}