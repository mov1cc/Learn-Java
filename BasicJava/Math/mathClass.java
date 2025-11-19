package BasicJava.Math;
public class mathClass {
    public static void main(String[] args) {
        // PI ARTINYA NILAI DARI PI π
        System.out.println(Math.PI);
        // E ARTINYA NILAI DARI EULER
        System.out.println(Math.E);

        // DEKLARASI VARIABEL
        double result;
        // POW(POWER)ARTINYA PANGKAT,JADI 2^5
        result = Math.pow(2, 5);
        // ABS(ABSOLUTE)ARTINYA NILAI MUTLAK
        result = Math.abs(-7);
        // SQRT(SQUARE ROOT)ARTINYA AKAR KUADRAT
        result = Math.sqrt(36);
        // CBRT()ARTINYA AKAR PANGKAT TIGA
        result = Math.cbrt(8);
        // ROUND(ROUNDING)ARTINYA PEMBULATAN KE INTEGER TERDEKAT
        result = Math.round(3.14);
        // CEIL(CEILING)ARTINYA PEMBULATAN KE ATAS
        result = Math.ceil(5.13);
        // FLOOR(FLOOR)ARTINYA PEMBULATAN KE BAWAH
        result = Math.floor(7.89);
        // MAX(MAXIMUM)ARTINYA NILAI MAXIMUM ATAU TERBESAR
        result = Math.max(12, 80);
        // MIN(MINIMUM)ARTINYA NILAI MINIMUM ATAU TERKECIL
        result = Math.min(4, 7);

        System.out.println(result);
    }
}