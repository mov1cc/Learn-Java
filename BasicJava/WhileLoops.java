package BasicJava;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        // Membuat scanner untuk input dari keyboard
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        String name = "";
        String name2 = "";
        String response = "";

        int age = 0;
        int age2 = 0;
        int num = 0;
        int num2 = 0;

        // ===== Contoh IF =====
        // Mengecek apakah variabel 'name' masih kosong
        // Jika kosong, maka minta user mengisi nama
        if (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = sc.nextLine();
        }

        // ===== Contoh WHILE =====
        // Perulangan akan terus berjalan selama name2 masih kosong
        while (name2.isEmpty()) {
            System.out.print("Enter your name: ");
            name2 = sc.nextLine();
        }

        // ===== Contoh INFINITE LOOP (Dikomentari) =====
        // while(1=1){ // SALAH, tidak bisa pakai '=' dan 1 bukan boolean
        // System.out.println("Help I am stuck in loops");
        // }

        System.out.println("Hello " + name);
        System.out.println("Hello " + name2);

        // ===== WHILE dengan kondisi berhenti =====
        // Program akan terus berjalan selama user tidak mengetik "Q"
        while (!response.equals("Q")) {
            System.out.println("YOU ARE PLAYING THE GAMES");
            System.out.print("TYPE Q TO QUIT THE GAMES: ");
            response = sc.nextLine().toUpperCase(); // ubah input jadi huruf besar
        }

        System.out.println("YOU QUIT THE GAMES");

        // ===== Validasi input menggunakan WHILE =====
        System.out.print("ENTER YOUR AGE: ");
        age = sc.nextInt();

        // Jika umur negatif, minta input ulang sampai valid
        while (age < 0) {
            System.out.println("YOUR AGE CAN'T BE NEGATIVE");
            System.out.print("ENTER YOUR AGE: ");
            age = sc.nextInt();
        }

        System.out.println("YOU ARE " + age + " YEARS OLD");

        // ===== Contoh DO-WHILE =====
        // Perulangan akan dijalankan dulu minimal sekali baru dicek kondisinya
        do {
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age2 = sc.nextInt();
        } while (age2 < 0);

        System.out.println("You are " + age2 + " years old");

        // ===== Validasi angka dengan WHILE =====
        // Hanya menerima angka 1 sampai 10
        while (num < 1 || num > 10) {
            System.out.print("ENTER A NUMBER BETWEEN 1-10: ");
            num = sc.nextInt();
        }

        System.out.println("YOU PICKED " + num);

        // ===== Validasi angka dengan DO-WHILE =====
        do {
            System.out.print("ENTER A NUMBER BETWEEN 1-10: ");
            num2 = sc.nextInt();
        } while (num2 < 1 || num2 > 10);

        System.out.println("YOU PICKED " + num2);

        // Tutup scanner
        sc.close();
    }
}