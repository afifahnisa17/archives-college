public class ContohVarargs {
    // Fungsi dengan varargs dari tipe data int
    public static void fungsiVarargsInt(int... angka) {
        System.out.print("Angka: ");
        for (int i : angka) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Fungsi dengan varargs dari tipe data String
    public static void fungsiVarargsString(String... kata) {
        System.out.print("Kata: ");
        for (String s : kata) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Memanggil fungsi dengan varargs tipe data int
        fungsiVarargsInt(1, 2, 3, 4, 5);

        // Memanggil fungsi dengan varargs tipe data String
        fungsiVarargsString("Halo", "Ini", "Contoh", "Varargs");
    }
}

