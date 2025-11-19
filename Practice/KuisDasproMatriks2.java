package Practice;

import java.util.Scanner;

public class KuisDasproMatriks2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // INPUT ORDO
        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();

        // DEKLARASI MATRIKS
        int[][] A = new int[baris][kolom];
        int[][] B = new int[baris][kolom];
        int[][] C = new int[baris][kolom]; // hasil pengurangan

        // INPUT MATRIKS A
        System.out.println("\nMasukkan elemen matriks A:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }

        // INPUT MATRIKS B
        System.out.println("\nMasukkan elemen matriks B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = sc.nextInt();
            }
        }

        // PROSES PENGURANGAN
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }

        // OUTPUT HASIL
        System.out.println("\nHasil pengurangan matriks (A - B):");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}