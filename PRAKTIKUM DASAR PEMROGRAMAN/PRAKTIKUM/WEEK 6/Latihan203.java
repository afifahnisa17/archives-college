import java.util.Scanner; // agar pengguna dapat menginputkan sesuatu

public class Latihan203 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);

        // mendeklarasikan variabel
        String jenis_buku;
        double diskon;
        int jumlah_buku, harga_buku, bayar;

        System.out.println("Masukkan jenis buku : "); // untuk menampilkan tulisan "Masukkan jenis buku :"
        jenis_buku = input03.nextLine(); // agara pengguna dapat menginputkan jenis buku
        System.out.println("Masukkan jumlah buku :"); // untuk menampilkan tulisan "Masukkan jumlah buku :"
        jumlah_buku = input03.nextInt(); // agar pengguna dapat menginputkan jumlah buku
        System.out.println("Masukkan harga buku :"); // untuk menampilkan tulisan "Masukkan harga buku :"
        harga_buku = input03.nextInt(); // agar pengguna dapat menginputkan harga buku

        //jika jenis buku adalah kamus dan memiliki jumlah lebih dari 2, diskonnya 0.12, jika kurang dari itu maka diskonnya 0.1
        if (jenis_buku.equalsIgnoreCase("Kamus")) {
            if (jumlah_buku > 2) {
                diskon = 0.12;
            } else diskon = 0.1;

        //jika jenis buku adalah novel dan memiliki jumlah lebih dari 3, diskonnya 0.09, jika kurang dari itu maka diskonnya 0.08
        } else if (jenis_buku.equalsIgnoreCase("Novel")) {
            if (jumlah_buku > 3) {
                diskon = 0.09;
            } else diskon = 0.08;
        
        //jika jumlah buku selain dari kamus dan novel dan memiliki jumlah buku lebih dari 3, diskonnya 0.05
        } else if (jumlah_buku > 3) {
            diskon = 0.05;

        // jika selain itu, maka pengguna tidak mendapatkan diskon
        } else 
            diskon = 0;

            //ditambah int untuk mengconvert tipe data double ke int
            bayar = (int)((jumlah_buku*harga_buku) - (diskon*(jumlah_buku*harga_buku))); 
            System.out.println("Jumlah diskon : " + (diskon*(jumlah_buku*harga_buku))) ;
            System.out.println("Harga yang harus anda bayar : " + bayar);
    }   
}
