public class VariabelScope {

    static int x = 3;// Static variabel milik class bukan method dan bisa diakses semua method dalam class yang sama jika modifiernya privat tetapi jika modifiernya public maka bisa diakses class lain.
    public static void main(String[] args) {

        // Variable Scope = Where variable can be accessed

        int x = 1;// Local Variabel hanya bisa diakses sesuai tempat variabel di deklarasikan.
        // Variabel local x ini milik method main

        System.out.println(x);
        doSomething();/*Ketika memanggil method doSomething maka method tersebut akan menampilkan variabel x lokal pada method tersebut,
        Karena pada method doSomething terdapat perintah println dan variabel yang terdekat dengan perintah tersebut adalah variabel x pada method tersebut dan hanya bisa diakses pada method tersebut.*/
    }

    static void doSomething() {

        int x = 2;// Local Variabel hanya bisa diakses sesuai tempat variabel di deklarasikan
        // Variabel local x ini milik method doSomething

        System.out.println(x);
    }
}