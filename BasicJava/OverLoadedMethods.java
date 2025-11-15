package BasicJava;

public class OverLoadedMethods {
    public static void main(String[] args) {

        // Overloaded Methods = Mtehods that share the same name but different
        // parameters
        // Signature = name + parameters

        System.out.println(add(3, 5, 5));

        String pizza = bakeBread("Flat Bread", "Mozarella", "Pepperoni");

        System.out.println(pizza);
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    static String bakeBread(String bread) {
        return bread + " Pizza";
    }

    static String bakeBread(String bread, String cheese) {
        return bread + " " + cheese + " Pizza";
    }

    static String bakeBread(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + " Pizza";
    }
}