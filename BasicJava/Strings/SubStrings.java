package BasicJava.Strings;

import java.util.Scanner;

public class SubStrings {
    public static void main(String[] args) {

        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel email, username, dan domain
        String email3;
        String username3;
        String domain3;

        // Meminta input email dari pengguna
        System.out.print("Enter your email: ");
        email3 = sc.nextLine();

        // Mengecek apakah email mengandung karakter '@'
        if (email3.contains("@")) {

            // Memisahkan username dan domain berdasarkan posisi '@'

            // substring(start, finish)
            // - start bersifat inklusif (>=) → karakter pada posisi ini ikut diambil
            // - finish bersifat eksklusif (<) → karakter pada posisi ini tidak diambil
            // Contoh: substring(0, 4) akan mengambil index [0,1,2,3] (tidak termasuk 4)
            //
            // Jika hanya menulis substring(start) tanpa finish,
            // maka potongan string akan diambil mulai dari 'start' sampai AKHIR string.

            username3 = email3.substring(0, email3.indexOf("@")); // sebelum '@'
            domain3 = email3.substring(email3.indexOf("@") + 1); // setelah '@'

            // Menampilkan hasil pemisahan email
            System.out.println("The username is " + username3);
            System.out.println("The domain is " + domain3);

        } else {
            // Jika email tidak mengandung '@', tampilkan pesan kesalahan
            System.out.println("The email must contain '@'");
        }

        // ===== Contoh penggunaan substring secara manual =====

        String email = "movic27@gmail.com";

        // substring(0,7) → mengambil huruf dari index 0 s.d. sebelum index 7
        // substring(8,17) → mengambil huruf dari index 8 s.d. sebelum index 17
        // Contoh: pada "movic27@gmail.com"
        // index 0 → m
        // index 6 → 7
        // index 7 → @ (tidak ikut karena batas eksklusif)
        String username = email.substring(0, 7);
        String domain = email.substring(8, 17);

        // ===== Contoh kedua (lebih fleksibel dengan indexOf) =====

        String email2 = "movic123@gmail.com";
        String username2 = email2.substring(0, email2.indexOf("@"));
        String domain2 = email2.substring(email2.indexOf("@") + 1);

        // Menampilkan hasil dari kedua contoh
        System.out.println(email);
        System.out.println(username);
        System.out.println(domain);

        System.out.println(username2);
        System.out.println(domain2);

        // Menutup Scanner untuk mencegah kebocoran resource
        sc.close();
    }
}
