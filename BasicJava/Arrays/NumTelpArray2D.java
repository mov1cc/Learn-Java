package BasicJava.Arrays;

public class NumTelpArray2D {
    public static void main(String[] args) {

        char telephones[][] = { { '1', '2', '3' },
                { '4', '5', '6' },
                { '7', '8', '9' },
                { '*', '0', '#' } };

        for (char row[] : telephones) {
            for (char number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

}