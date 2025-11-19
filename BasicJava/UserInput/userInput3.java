package BasicJava.UserInput;
import java.util.Scanner;

public class userInput3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();// untuk membuang sisa input dan enter\n agar scanner setelahnya tidak otomatis
                           // mendapat sisa inputan di atasnya,ini berlaku jika menggunakan print
                           // saja,tetapi println juga bakal otomatis dapat input sisa,jadi jangab lupa
                           // kasi scanner.nextLine(); untuk membuang sisa input dan enter\n.Khusus untuk
                           // tipe data selain String,akan tetapi ada kasus tertentu tipe data String akan
                           // mendapatkan sisa input dan enter\n karena mencampurkan next(); dengan
                           // nextLine();,oh iya ini berlaku kalo setelah input tipe data
                           // angka,boolean,double,terus setelahnya input string jadi wajib tambahin
                           // scanner.nextLine();

        System.out.print("Enter your fav color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("your favorit color is " + color);

        scanner.close();

    }
}
// HARUSNYA INI USER INPUT 2