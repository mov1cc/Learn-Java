package miniProject;

// Import library untuk input dan angka acak
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {

        // Membuat objek untuk menghasilkan angka acak
        Random random = new Random();

        // Deklarasi variabel
        int guess; // Menyimpan tebakan dari pengguna
        int attempts = 0; // Menghitung berapa kali pengguna menebak
        int min = 1; // Batas bawah angka acak
        int max = 100; // Batas atas angka acak

        // Menghasilkan angka acak antara min dan max (inklusif)
        int randomNum = random.nextInt(min, max + 1);

        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner sc = new Scanner(System.in);

        // Menampilkan judul permainan dan rentang angka yang harus ditebak
        System.out.println("=====NUMBER GUESSING GAME=====");
        System.out.printf("GUESS A NUMBER BETWEEN %d-%d\n", min, max);

        // Perulangan utama permainan
        do {
            // Meminta pengguna memasukkan tebakan
            System.out.print("ENTER A GUESS: ");
            guess = sc.nextInt(); // Membaca input tebakan
            attempts++; // Menambah jumlah percobaan setiap kali menebak

            // Mengecek apakah tebakan di luar rentang angka
            if (guess < min || guess > max) {
                System.out.println("OUT OF THE RANGE, PLEASE GUESS BETWEEN " + min + " AND " + max);
                continue; // Lewati sisa kode di bawah dan lanjut ke iterasi berikutnya
            }

            // Mengecek apakah tebakan terlalu rendah
            if (guess < randomNum) {
                System.out.println("TOO LOW! TRY AGAIN");
            }
            // Mengecek apakah tebakan terlalu tinggi
            else if (guess > randomNum) {
                System.out.println("TOO HIGH! TRY AGAIN");
            }
            // Jika tebakan benar
            else {
                System.out.println("\nCORRECT! THE NUMBER WAS " + randomNum);
                System.out.println("# OF ATTEMPTS " + attempts);
            }

        } while (guess != randomNum); // Ulangi selama tebakan belum benar

        // Menutup Scanner untuk menghindari kebocoran sumber daya
        sc.close();
    }
}
