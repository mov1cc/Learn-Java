package BasicJava;

public class BreakAndContinue {
    public static void main(String[] args) {
        // break = keluar dari loop sepenuhnya (menghentikan perulangan)
        // continue = melewati (skip) satu iterasi loop, tapi lanjut ke iterasi
        // berikutnya

        for (int i = 0; i <= 10; i++) { // perulangan dari i = 0 sampai i = 10

            if (i == 8) {
                // jika i bernilai 8, hentikan loop (tidak lanjut ke iterasi berikutnya)
                break;
            }

            if (i == 6) {
                // jika i bernilai 6, lewati bagian di bawah (System.out.print)
                // dan langsung lanjut ke iterasi berikutnya
                continue;
            }

            System.out.print(i + " "); // cetak nilai i di baris yang sama
        }
    }
}