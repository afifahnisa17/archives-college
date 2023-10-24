import java.util.Scanner;
public class HargaBayar03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2= new Scanner(System.in);
        int harga, jumlah, halBuku;
        String merkBuku;
        double dis, total,bayar,jmlDis;

        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("Masukkan Merk Buku ");
        merkBuku=input2.nextLine();
        System.out.println("Masukkan Jumlah halaman buku ");
        halBuku=input.nextInt();
        System.out.println("Masukkan diskon");
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);
        System.out.println("Merk buku yang anda beli adalah " + merkBuku + " 25dengan total halaman " + halBuku);
    }
}