package miniProject;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        double temperature; // suhu awal yang akan dikonversi
        String unit; // satuan tujuan (C atau F)

        System.out.println("===== TEMPERATURE CONVERSION =====");

        Scanner sc = new Scanner(System.in);

        // Input suhu dari user
        System.out.print("ENTER THE TEMPERATURE: ");
        temperature = sc.nextDouble();

        // Input satuan tujuan (C untuk Celsius, F untuk Fahrenheit)
        System.out.print("CONVERT TO CELSIUS OR FAHRENHEIT (C or F): ");
        unit = sc.next();
        // atau bisa juga dari input diubah jadi kapital unit= sc.next().toUpperCase();

        /*
         * Operator ternary:
         * (kondisi) ? (nilai jika true) : (nilai jika false)
         * 
         * Jika user mengetik "C" → berarti konversi dari Fahrenheit ke Celsius:
         * rumusnya: (temperature - 32) * 5/9
         * 
         * Jika user mengetik "F" → berarti konversi dari Celsius ke Fahrenheit:
         * rumusnya: (temperature * 9/5) + 32
         */
        double newTemperature = (unit.equalsIgnoreCase("C"))
                ? ((temperature - 32) * 5 / 9)
                : (temperature * 9 / 5 + 32);
        // jika menggunakan perubahan langsung ke kapital maka menggunakan
        // unit.equals("c") saja karena sudah diubah jadi kapital tidak perlu Ignore
        // Case

        // Output hasil konversi
        System.out.printf("CONVERTED TEMPERATURE: %.1f°%s\n",
                newTemperature, unit.toUpperCase());
        // untuk menampilkan unit jika menggunakan perubahan kapital terlebih
        // dahulu,tidakperlu toUpperCase,karena sudah dikapitalisasi di awal
        sc.close();
    }
}