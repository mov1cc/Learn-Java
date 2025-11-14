package miniProject;

import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        // Judul program
        System.out.println("===== WEIGHT CONVERSION PROGRAM =====");

        // Deklarasi variabel
        double weight; // berat asli yang dimasukkan user
        double newWeight; // hasil konversi berat
        int option; // pilihan menu konversi

        // Membuat objek Scanner untuk membaca input dari user
        Scanner sc = new Scanner(System.in);

        // Menampilkan pilihan menu
        System.out.println("1: CONVERT WEIGHT IN LBS TO KG");
        System.out.println("2: CONVERT WEIGHT IN KG TO LBS");

        // Input pilihan user
        System.out.print("ENTER YOUR OPTION: ");
        option = sc.nextInt();

        // Mengecek pilihan menggunakan if-else
        if (option == 1) {
            // Jika user memilih 1: konversi dari lbs ke kg
            System.out.print("ENTER YOUR WEIGHT IN LBS: ");
            weight = sc.nextDouble();

            // 1 pound (lbs) = 0.453592 kilogram (kg)
            newWeight = weight * 0.453592;

            // Menampilkan hasil konversi dengan 2 angka di belakang koma
            System.out.printf("YOUR WEIGHT: %.2f kg", newWeight);
        } else if (option == 2) {
            // Jika user memilih 2: konversi dari kg ke lbs
            System.out.print("ENTER YOUR WEIGHT IN KG: ");
            weight = sc.nextDouble();

            // 1 kilogram (kg) = 2.20462 pound (lbs)
            newWeight = weight * 2.20462;

            // Menampilkan hasil konversi dengan 2 angka di belakang koma
            System.out.printf("YOUR WEIGHT: %.2f lbs", newWeight);
        } else {
            // Jika user memasukkan angka selain 1 atau 2
            System.out.println("THAT'S NOT A VALID OPTION!");
        }

        // Menutup Scanner untuk mencegah memory leak
        sc.close();
    }
}