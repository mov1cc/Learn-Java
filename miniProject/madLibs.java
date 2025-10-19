package miniProject;
import java.util.Scanner;
public class madLibs {
    public static void main(String[]args){
        //DEKLARASI VARIABEL
        String namakarakter;
        String tempat;
        String objek;
        String hewan;
        String senjata;
        //HEADER
        System.out.println("==========Adventure Story==========");
        //
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Masukkan nama karakter: ");
        namakarakter=scanner.nextLine();
        System.out.print("Masukkan tempat: ");
        tempat=scanner.nextLine();
        System.out.print("Masukkan objek: ");
        objek=scanner.nextLine();
        System.out.print("Masukkan hewan: ");
        hewan=scanner.nextLine();
        System.out.print("Masukkan senjata: ");
        senjata=scanner.nextLine();
        //OUTPUT
        System.out.println("Pada suatu desa bernama "+tempat+" terdapat seorang pembawa masalah yang sering kali namanya disebut-sebut oleh asosiasi detektif, orang itu adalah "+namakarakter+". Pada suatu hari, dia bertemu seekor hewan legenda yang sangat kuat, hewan itu seringkali memakan korban sehingga namanya tidak asing lagi. Hewan itu adalah "+hewan+", "+namakarakter+" ingin membunuhnya menggunakan senjata kesayangannya,senjata itu adalah "+senjata+" akan tetapi hewan itu sangat kuat, "+namakarakter+" pun secara tidak sengaja tersandung "+objek+" sehingga ia terjatuh dan namanya masuk ke dalam daftar korban orang yg habis dimakan "+hewan+".");
        
        
        scanner.close();
        
        
    }
}