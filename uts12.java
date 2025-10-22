import java .util.Scanner;
public class uts12 {
    public static void main(String[]args){
        
        int prestasi;
        double ipk;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("=========== PROGRAM BEASISWA MAHASISWA BERPRESTASI ===========");
        System.out.print("MASUKKAN JUMLAH PRESTASI LOMBA: ");
        prestasi=sc.nextInt();

        System.out.print("MASUKKAN NILAI IPK ANDA: ");
        ipk=sc.nextDouble();
        
        
        if(prestasi > 3 && ipk > 3.5){
            System.out.println("SELAMAT ANDA LULUS BEASISWA");
        } else {
            System.out.println("MAAF ANDA TIDAK LULUS BEASISWA");
        }
    }
}
//buat program ketentuan menentukan mahasiswa berprestasi jumlah prestasi lomba lebih dari 3 dan ipk lebih dari 3,5.
