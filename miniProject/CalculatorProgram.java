package miniProject;

import java.util.Scanner; // Import class Scanner untuk input dari pengguna

public class CalculatorProgram {
    public static void main(String[] args) {

        // Deklarasi variabel
        double num1; // Menyimpan angka pertama
        double num2; // Menyimpan angka kedua
        char operator; // Menyimpan simbol operasi (+, -, *, /, ^)
        double result = 0; // Menyimpan hasil perhitungan
        boolean validOperation = true; // Menandai apakah operasi valid atau tidak

        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner sc = new Scanner(System.in);

        // Judul program
        System.out.println("===== CALCULATOR PROGRAM =====");

        // Input angka pertama
        System.out.print("ENTER THE FIRST NUMBER: ");
        num1 = sc.nextDouble();

        // Input operator
        System.out.print("ENTER THE OPERATION (+, -, *, /, ^): ");
        operator = sc.next().charAt(0); // Mengambil karakter pertama dari input

        // Input angka kedua
        System.out.print("ENTER THE SECOND NUMBER: ");
        num2 = sc.nextDouble();

        // Struktur kontrol untuk menentukan operasi berdasarkan operator
        switch (operator) {
            case '+' -> result = num1 + num2; // Operasi penjumlahan
            case '-' -> result = num1 - num2; // Operasi pengurangan
            case '*' -> result = num1 * num2; // Operasi perkalian

            case '/' -> { // Operasi pembagian
                if (num2 == 0) { // Cek apakah pembagi nol
                    System.out.println("YOU CAN'T DIVIDE BY ZERO!");
                    validOperation = false; // Tandai operasi tidak valid
                } else {
                    result = num1 / num2; // Lakukan pembagian jika valid
                }
            }

            case '^' -> result = Math.pow(num1, num2); // Operasi pemangkatan (num1^num2)

            default -> { // Jika operator tidak dikenal
                System.out.println("YOU DIDN'T ENTER A VALID OPERATOR!");
                validOperation = false; // Tandai operasi tidak valid
            }
        }

        // Menampilkan hasil hanya jika operasi valid
        if (validOperation) {
            System.out.println("RESULT: " + result);
        }

        // Menutup Scanner untuk mencegah memory leak
        sc.close();
    }
}