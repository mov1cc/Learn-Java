public class switchCase{
public static void main(String[]args){
int hari = 3;
String namaHari;

switch (hari) {
    case 1:
        namaHari = "Senin";
        break;
    case 2:
        namaHari = "Selasa";
        break;
    case 3:
        namaHari = "Rabu";
        break;
    default:
        namaHari = "Hari tidak valid";
}

System.out.println("Hari ke-3 adalah " + namaHari);
}
}