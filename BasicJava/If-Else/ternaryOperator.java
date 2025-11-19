
import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {

        // =============================
        // TERNARY OPERATOR (?:)
        // =============================
        // Fungsi:
        // → Mengembalikan satu dari dua nilai, tergantung apakah kondisi bernilai true
        // atau false.
        //
        // Bentuk umum:
        // variabel = (kondisi) ? nilaiJikaTrue : nilaiJikaFalse;
        //
        // Sama seperti bentuk if-else berikut:
        // if (kondisi) {
        // variabel = nilaiJikaTrue;
        // } else {
        // variabel = nilaiJikaFalse;
        // }

        // ===== Contoh-contoh dasar =====
        int score = 79;
        int number = 3;
        int hours = 11;
        int income = 50000;
        int nilai;
        int prestasi;

        // (score >= 80) → jika true maka "PASS", jika false maka "FAIL"
        String passOrFail = (score >= 80) ? "PASS" : "FAIL";

        // (number % 2 == 0) → jika true maka "EVEN", jika false maka "ODD"
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        // (hours < 12) → jika true maka "A.M.", jika false maka "P.M."
        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";

        // (income >= 40000) → jika true maka 0.25, jika false maka 0.15
        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        // ===== Contoh dengan input dari user =====
        Scanner sc = new Scanner(System.in);

        System.out.print("MASUKKAN NILAI: ");
        nilai = sc.nextInt();

        System.out.print("MASUKKAN PRESTASI: ");
        prestasi = sc.nextInt();

        // Kondisi kelulusan:
        // jika nilai > 3 dan prestasi > 3 → "LULUS"
        // selain itu → "TIDAK LULUS"
        String kelulusan = (nilai > 3 && prestasi > 3) ? "LULUS" : "TIDAK LULUS";

        // ===== Menampilkan hasil =====
        System.out.println(passOrFail);
        System.out.println(evenOrOdd);
        System.out.println(timeOfDay);
        System.out.println(taxRate);
        System.out.println(kelulusan);

        // Menutup Scanner untuk mencegah memory leak
        sc.close();
    }
}