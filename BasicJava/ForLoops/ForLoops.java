package BasicJava.ForLoops;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) throws InterruptedException {

        // ==============================
        // FOR LOOP = menjalankan kode berulang kali
        // ==============================

        System.out.println("LOOP BASIC INCREMENT");
        // Loop dari 0 hingga kurang dari 5 (0,1,2,3,4)
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("LOOP BASIC INCREMENT START FROM 1");
        System.out.println("");

        // Loop dari 1 hingga 5 (1,2,3,4,5)
        for (int k = 1; k <= 5; k++) {
            System.out.println(k);
        }

        System.out.println("LOOP BASIC DECREMENT");
        System.out.println("");

        // Loop menurun dari 5 ke 1
        for (int a = 5; a > 0; a--) {
            System.out.println(a);
        }

        System.out.println("LOOP BASIC ODD NUMBER");
        System.out.println("");

        // Loop menampilkan bilangan ganjil dari 1 hingga 9
        for (int b = 1; b <= 10; b += 2) {
            System.out.println(b);
        }

        System.out.println("LOOP BASIC EVEN NUMBER");
        System.out.println("");

        // Loop menampilkan bilangan genap dari 2 hingga 10
        for (int c = 2; c <= 10; c += 2) {
            System.out.println(c);
        }

        System.out.println("LOOP BASIC DECREMENT EVEN NUMBER");
        System.out.println("");

        // Loop menurun dengan bilangan genap (10,8,6,4,2)
        for (int d = 10; d > 0; d -= 2) {
            System.out.println(d);
        }

        System.out.println("LOOP BASIC DECREMENT ODD NUMBER");
        System.out.println("");

        // Loop menurun dengan bilangan ganjil (11,9,7,5,3,1)
        for (int d = 11; d > 0; d -= 2) {
            System.out.println(d);
        }

        System.out.println("INCREMENT LOOP WITH SCANNER");

        // Membuat objek Scanner untuk membaca input dari user
        Scanner sc = new Scanner(System.in);

        // Meminta input berapa kali loop akan dijalankan
        System.out.print("ENTER HOW MUCH U NEED LOOP: ");
        int max = sc.nextInt();

        // Loop dari 0 sampai (max-1)
        for (int e = 0; e < max; e++) {
            System.out.println(e);
        }

        System.out.println("COUNTDOWN LOOP USE THREAD SLEEP");
        System.out.println("");

        // Menentukan titik awal hitung mundur
        int start = 10;

        // Loop countdown dari 10 ke 1
        // Thread.sleep(1000) memberi jeda 1 detik setiap angka
        for (int h = start; h >= 1; h--) {
            System.out.println(h);
            Thread.sleep(1000); // jeda 1 detik
        }

        System.out.println("HAPPY NEW YEAR !");

        System.out.println("COUNTDOWN LOOP WITH SCANNER");

        int start2 = 0;

        // Meminta input dari user untuk jumlah hitungan mundur
        System.out.print("How many second to countdown from: ");
        start2 = sc.nextInt();

        // Loop countdown sesuai input user
        for (int g = start2; g >= 1; g--) {
            System.out.println(g);
            Thread.sleep(1000); // jeda 1 detik
        }

        System.out.println("BOOM!");

        // Menutup scanner agar tidak terjadi memory leak
        sc.close();
    }
}