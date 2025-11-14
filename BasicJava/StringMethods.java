package BasicJava;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Ibrahim Movic";
        String name2 = "";
        String name3 = "Movic";
        String name4 = "password";

        System.out.println("===== STRING METHODS DEMO =====\n");

        // 1️⃣ length() → menghitung panjang string
        int length = name.length();
        System.out.println("1. Panjang string name: " + length);

        // 2️⃣ charAt() → mengambil 1 karakter berdasarkan index
        char letter = name.charAt(2);
        System.out.println("2. Huruf ke-3 pada name: " + letter);

        // 3️⃣ indexOf() → posisi pertama huruf 'i'
        int index = name.indexOf("i");
        System.out.println("3. Index pertama huruf 'i': " + index);

        // 4️⃣ lastIndexOf() → posisi terakhir huruf 'i'
        int lastindex = name.lastIndexOf("i");
        System.out.println("4. Index terakhir huruf 'i': " + lastindex);

        // 5️⃣ toUpperCase() → ubah ke huruf besar
        System.out.println("5. toUpperCase(): " + name.toUpperCase());

        // 6️⃣ toLowerCase() → ubah ke huruf kecil
        System.out.println("6. toLowerCase(): " + name.toLowerCase());

        // 7️⃣ trim() → hapus spasi awal & akhir (bukan di tengah)
        String nameTrimmed = "   " + name + "   ";
        System.out.println("7. Sebelum trim: [" + nameTrimmed + "]");
        System.out.println("   Sesudah trim: [" + nameTrimmed.trim() + "]");

        // 8️⃣ replace() → ganti huruf 'a' jadi 'i'
        System.out.println("8. replace('a','i'): " + name.replace("a", "i"));

        // 9️⃣ isEmpty() → cek apakah string kosong
        System.out.println("9. name2.isEmpty(): " + name2.isEmpty());
        System.out.println("   name3.isEmpty(): " + name3.isEmpty());

        // 🔟 contains() → cek apakah string mengandung spasi
        System.out.println("10. name.contains(\" \"): " + name.contains(" "));

        System.out.println("\n===== IF CONDITIONS =====");

        // IF 1: cek name3 kosong atau tidak
        if (name3.isEmpty()) {
            System.out.println("Your name is empty");
        } else {
            System.out.println("Hello " + name3);
        }

        // IF 2: cek apakah name mengandung spasi
        if (name.contains(" ")) {
            System.out.println("Your name contains a space");
        } else {
            System.out.println("Your name DOESN'T contain any spaces");
        }

        // IF 3: equals() → bandingkan string secara sensitif huruf besar-kecil
        if (name4.equals("password")) {
            System.out.println("Your name can't be 'password'");
        } else {
            System.out.println("Hello " + name4);
        }

        // IF 4: equalsIgnoreCase() → bandingkan tanpa peduli huruf besar/kecil
        if (name4.equalsIgnoreCase("PaSswoRD")) {
            System.out.println("Your name can't be 'password' (ignore case)");
        } else {
            System.out.println("Hello " + name4);
        }

        System.out.println("\n===== END OF DEMO =====");
    }
}
