import java.util.Scanner;

public class penilaianMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data mahasiswa
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM  : ");
        String nim = sc.nextLine();

        // Input nilai dua mata kuliah
        System.out.println("\n--- Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS   : ");
        double uts1 = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas1 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas1 = sc.nextDouble();

        System.out.println("\n--- Struktur Data ---");
        System.out.print("Nilai UTS   : ");
        double uts2 = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas2 = sc.nextDouble();

        // Hitung nilai akhir
        double akhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        double akhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);

        // Konversi nilai ke huruf pakai if-else
        String grade1;
        if (akhir1 > 80) {
            grade1 = "A";
        } else if (akhir1 > 73) {
            grade1 = "B+";
        } else if (akhir1 > 65) {
            grade1 = "B";
        } else if (akhir1 > 60) {
            grade1 = "C+";
        } else if (akhir1 > 50) {
            grade1 = "C";
        } else if (akhir1 > 39) {
            grade1 = "D";
        } else {
            grade1 = "E";
        }

        String grade2;
        if (akhir2 > 80) {
            grade2 = "A";
        } else if (akhir2 > 73) {
            grade2 = "B+";
        } else if (akhir2 > 65) {
            grade2 = "B";
        } else if (akhir2 > 60) {
            grade2 = "C+";
        } else if (akhir2 > 50) {
            grade2 = "C";
        } else if (akhir2 > 39) {
            grade2 = "D";
        } else {
            grade2 = "E";
        }

        // Status lulus per mata kuliah pakai if-else
        String status1;
        if (akhir1 >= 60) {
            status1 = "LULUS";
        } else {
            status1 = "TIDAK LULUS";
        }

        String status2;
        if (akhir2 >= 60) {
            status2 = "LULUS";
        } else {
            status2 = "TIDAK LULUS";
        }

        // Status semester
        double rata = (akhir1 + akhir2) / 2;
        String statusSemester;
        if (status1.equals("LULUS") && status2.equals("LULUS") && rata >= 70) {
            statusSemester = "LULUS";
        } else {
            statusSemester = "TIDAK LULUS";
        }

        // Output hasil pakai println
        System.out.println("\n============== HASIL PENILAIAN ==============");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("---------------------------------------------");
        System.out.println("Mata Kuliah             UTS   UAS   TGS   Nilai Akhir   Huruf     Status");
        System.out.println("Algoritma & Pemrograman  " + uts1 + "    " + uas1 + "    " + tugas1 + "    " + akhir1 + "        " + grade1 + "      " + status1);
        System.out.p
