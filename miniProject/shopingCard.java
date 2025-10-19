package miniProject;
import java.util.Scanner;
public class shopingCard {
    public static void main(String[]args){
        //DEKLARASI VARIABEL
        String product;
        int quantities;
        double harga;
        double total;
        char simbol='$';
        //HEADLINE
        System.out.println("==========SELAMAT BERBELANJA==========");
        //USER INPUT
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Masukan Produk: ");
        product=sc.nextLine();
        System.out.print("Masukan Jumlah yang akan dibeli: ");
        quantities=sc.nextInt();
        System.out.print("Masukan Harga: "+simbol);
        harga=sc.nextDouble();
        
        sc.close();
        //PERHITUNGAN ARITHMETIC TOTAL BELANJA
        total=harga*quantities;
        //OUTPUT
        System.out.println("Anda membeli "+product+" sejumlah "+quantities);
        //System.out.println("Total belanja: "+simbol+total+"\s");
        //PRINTF AGAR ANGKA SETELAH KOMA RAPI
        System.out.printf("Total belanja: %c%.3f",simbol,total);
        System.out.println();
        System.out.println("Terima Kasih Telah Berbelanja");
        
        System.out.println("======================================");
        
    }
}