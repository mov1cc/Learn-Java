import java.util.Scanner;
public class nestedIf{
    public static void main(String[]args){
        //HEADER
        System.out.println("=====COMPOUND INTEREST CALCULATOR=====");
        //DEKLARASI VARIABEL
        int principal;
        double interest,time,compounded,hasil,totalbunga;
        char s='$';
        //INPUT SCANNER USER
        Scanner sc=new Scanner(System.in);
        
        System.out.print("MASUKAN MODAL AWAL: "+s);
        principal=sc.nextInt();
        System.out.print("MASUKAN BUNGA(DALAM PERSEN): ");
        interest=sc.nextDouble()/100;
        
        System.out.print("MASUKAN WAKTU: ");
        time=sc.nextDouble();
        
        System.out.print("MASUKAN FREKUENSI PENGGABUNGAN BUNGA PER TAHUN: ");
        compounded=sc.nextDouble();
        //PERHITUNGAN DNG RUMUS COMPOUND INTEREST DAN TOTAL BUNGA
        hasil=principal*Math.pow((1+interest//compounded),compounded*time);
        
        totalbunga=hasil-principal;
        
        sc.close();
        //OUTPUT
        System.out.println("======================================");
        System.out.printf("HASIL AKHIR: %c%,.0f\n",s,hasil);
        System.out.printf("TOTAL BUNGA: %c%,.0f\n",s,totalbunga);
    }
}