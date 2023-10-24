
import java.util.Scanner;

public class Toko03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Toko");
        System.out.println("Masukkan Nama Anda: ");
        String nama = input.nextLine();

        // inisialisasi variabel
        int totalItem = 0;
        int totalHarga = 0;
        int totalDiskon = 0;
        int totalAkhir = 0;
        char konfirmasi;

        do {
            // input produk, kuantitas, harga dan diskon
            System.out.println("Masukkan produk yang Anda beli: ");
            String produk = input.nextLine();
            System.out.println("Banyaknya: ");
            int banyakProduk = input.nextInt();
            System.out.println("Harga: ");
            int harga = input.nextInt();
            System.out.println("Diskon (%) :");
            int diskon = input.nextInt();
            input.nextLine(); // tambahan untuk mengonsumsi baris baru

            // hitung subtotal, diskon dan total
            int subtotal = banyakProduk * harga;
            int diskonProduk = subtotal * diskon / 100;
            int totalProduk = subtotal - diskonProduk;

            // update variabel
            totalItem += banyakProduk;
            totalHarga += subtotal;
            totalDiskon += diskonProduk;
            totalAkhir += totalProduk;

            // tanya apakah mau menambahkan produk lagi
            System.out.println("Apakah anda mau menambahkan produk (Y/N) :");
            konfirmasi = input.next().charAt(0);
            input.nextLine(); // tambahan untuk mengonsumsi baris baru
        } while (konfirmasi == 'y' || konfirmasi == 'Y');
            System.out.println("Apakah Anda punya kartu member? (Y/N)");
            char member = input.next().charAt(0);

        // hitung diskon tambahan jika member
        int diskonMember = 0;
        if (member == 'y' || member == 'Y') {
            if (totalHarga >= 200000) {
                diskonMember = totalHarga * 10 / 100;
            } else {
                diskonMember = totalHarga * 5 / 100;
            }
        }

        // update variabel
        totalDiskon += diskonMember;
        totalAkhir -= diskonMember;

        // output data
        System.out.println("---------------Total Pembelian---------------");
        System.out.println("Nama pelanggan: " + nama);
        if (member == 'y' || member == 'Y') {
            System.out.println("Tipe: Member");
        } else {
            System.out.println("Tipe: Non-Member");
        }
        System.out.println("Total item barang yang dibeli: " + totalItem);
        System.out.println("Total diskon: " + totalDiskon);
        System.out.println("Total akhir yang harus dibayar: " + totalAkhir);
        System.out.println("----------------------------------------------");
    }
}
