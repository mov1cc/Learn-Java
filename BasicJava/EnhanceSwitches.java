package BasicJava;

// Import library Scanner untuk input dari keyboard
import java.util.Scanner;

public class EnhanceSwitches {
    public static void main(String[] args) {

        // Deklarasi variabel
        String day; // untuk menyimpan input hari
        String color; // untuk menyimpan input warna
        int nilai; // untuk menyimpan nilai angka
        String grade; // untuk menyimpan nilai huruf hasil konversi

        // Membuat objek Scanner untuk membaca input dari user
        Scanner sc = new Scanner(System.in);

        // ==================== INPUT BAGIAN HARI ====================
        System.out.print("ENTER THE DAY OF THE WEEK: ");
        day = sc.nextLine(); // membaca input teks (misalnya: senin, selasa, dll.)

        // ==================== INPUT BAGIAN WARNA ====================
        System.out.print("ENTER THE COLOR: ");
        color = sc.nextLine(); // membaca input teks (misalnya: merah, biru, dll.)

        // ==================== INPUT NILAI ANGKA ====================
        System.out.print("MASUKKAN NILAI ANDA: ");
        nilai = sc.nextInt(); // membaca input bilangan bulat (misalnya: 85)

        // =============================================================
        // SWITCH UNTUK HARI (gunakan switch expression modern ->)
        // =============================================================
        // .toLowerCase() agar input tidak peka terhadap huruf besar/kecil
        // contoh: "Senin" atau "senin" dianggap sama
        switch (day.toLowerCase()) {
            case "senin" -> System.out.println("HARI YANG BERAT");
            case "selasa" -> System.out.println("SETIDAKNYA SATU HARI TERLEWATI");
            case "rabu" -> System.out.println("RABU RAWITT");
            case "kamis" -> System.out.println("KAMIS GAUL");
            case "jumat" -> System.out.println("JUMAT BERKAH");
            case "sabtu" -> System.out.println("SABTU CIHUY");
            case "minggu" -> System.out.println("BESOK SENIN");
            default -> System.out.println(day + " BUKAN NAMA HARI");
        }

        // =============================================================
        // SWITCH UNTUK WARNA (switch expression modern juga)
        // =============================================================
        // Kamu bisa gabungkan beberapa case sekaligus (multi-label case)
        switch (color.toLowerCase()) {
            case "merah", "kuning", "hijau", "biru" -> System.out.println("RAINBOW COLOR");
            case "hitam", "putih", "abu-abu" -> System.out.println("Minimalist Color");
            default -> System.out.println(color + " IS NOT THE NAME OF COLORS");
        }

        // =============================================================
        // SWITCH KLASIK UNTUK KONVERSI NILAI KE HURUF
        // =============================================================
        // Karena switch klasik tidak bisa cek range (misal 80–89),
        // kita gunakan nilai/10 agar mewakili kelompok nilai
        // 100–90 => 10,9 | 89–80 => 8 | 79–70 => 7, dst.
        switch (nilai / 10) {
            case 10: // nilai 100
            case 9: // nilai 90–99
                grade = "A";
                break;

            case 8: // nilai 80–89
                grade = "B+";
                break;

            case 7: // nilai 70–79
                grade = "B";
                break;

            case 6: // nilai 60–69
                grade = "C+";
                break;

            case 5: // nilai 50–59
                grade = "C";
                break;

            case 4: // nilai 40–49
                grade = "D";
                break;

            // Menggabungkan beberapa case yang hasilnya sama
            // (nilai 0–39 dianggap 'E')
            case 3:
            case 2:
            case 1:
            case 0:
                grade = "E";
                break;

            // Jika tidak masuk semua case di atas (misal nilai >100 atau negatif)
            default:
                System.out.println("STUDY BRO JUST LOCKIN NOW!"); // pesan tambahan
                grade = "INVALID"; // supaya variabel grade tetap punya nilai
                break;
        }

        // =============================================================
        // OUTPUT NILAI HURUF
        // =============================================================
        System.out.println("YOUR GRADE IS " + grade);

        // Tutup Scanner (kebiasaan baik untuk mencegah memory leak)
        sc.close();
    }
}