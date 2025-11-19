package BasicJava.Operators;

import java.util.Scanner; // Mengimpor class Scanner untuk input dari pengguna

public class LogicalOperators {
    public static void main(String[] args) {

        // ========== LOGICAL OPERATOR ==========
        // && = AND → semua kondisi harus benar
        // || = OR → salah satu kondisi benar sudah cukup
        // ! = NOT → membalik nilai boolean (true jadi false, false jadi true)

        double temp = -10; // Menyimpan suhu (dalam derajat)
        boolean isSunny = false; // Menyimpan apakah cuaca cerah atau tidak
        String username; // Menyimpan input username

        // Mengecek kondisi cuaca
        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("THE WEATHER IS GOOD 🐱");
            System.out.println("IT IS SUNNY OUTSIDE 🌞");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            // '!' membalik nilai, jadi kondisi ini berarti "tidak cerah"
            System.out.println("THE WEATHER IS GOOD 🐱");
            System.out.println("IT IS CLOUDY OUTSIDE ☁");
        } else if (temp > 30 || temp < 0) {
            // Jika suhu lebih dari 30 atau di bawah 0
            System.out.println("THE WEATHER IS BAD 😿");
        }

        // ========== USERNAME VALIDATION ==========
        Scanner sc = new Scanner(System.in); // Membuat objek Scanner untuk input

        System.out.print("ENTER USERNAME: ");
        username = sc.nextLine(); // Membaca input username dari user

        // Mengecek panjang username
        if (username.length() < 4 || username.length() > 12) {
            System.out.println("USERNAME MUST BE 4-12 CHARACTER");
        }
        // Mengecek apakah username mengandung spasi atau underscore
        else if (username.contains(" ") || username.contains("_")) {
            System.out.println("USERNAME MUST NOT CONTAIN SPACES OR UNDERSCORES");
        }
        // Jika lolos semua validasi
        else {
            System.out.println("WELCOME " + username);
        }

        sc.close(); // Menutup Scanner (praktik yang baik)
    }
}
