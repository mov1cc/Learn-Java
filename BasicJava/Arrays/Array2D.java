package BasicJava.Arrays;

public class Array2D {
    public static void main(String[] args) {
        // 2D ARRAY  = AN ARRAY WHERE EACH ALEMENT IS AN ARRAY
        // USEFULL FOR RESTORTING A MATRIX OF DATA

        /*String Fruits[] = {"apple", "banana", "manggo"};
        String Vegetables[] = {"wortel", "tomat", "brokoli"};
        String Meat[] = {"ayam", "sapi", "kambing", "unta"};*/

        //String[][] Groceries= {Fruits,Vegetables,Meat};
        String [][] Groceries = {{"apple", "banana", "manggo"},
                                {"wortel", "tomat", "brokoli"},
                                {"ayam", "sapi", "kambing", "unta"}};

        Groceries[0][0] = "Blubberry";
        Groceries[1][1] = "Potato";

        for(String[] foods : Groceries){
            for(String food : foods){
                System.out.print(food +" ");
            }
            System.out.println();
        }
    }
}
