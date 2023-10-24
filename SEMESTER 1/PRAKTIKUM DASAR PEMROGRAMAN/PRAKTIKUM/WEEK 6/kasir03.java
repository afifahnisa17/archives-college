import java.util.Scanner;

public class kasir03 {
    public static void main(String[] args) {
        int total, diskon, bayar;
        String kartu;
        Scanner sc03 = new Scanner(System.in);
        System.out.println("Apakah pelanggan memiliki kartu anggota (y atau t)? ");
        kartu = sc03.nextLine();
        System.out.println("Berapa total harga barang belanjaan? Rp ");
        total = sc03.nextInt();
       
        if (kartu.equals("y")) {
            if (total > 500000) {
                diskon = 50000;
            } else {
                diskon = 25000;
            }
        } else {
            if (total > 200000) {
                diskon = 10000;
            } else {
                diskon = 0;
            }
        }
        
        bayar = total - diskon;
        System.out.println("Total yang harus dibayar: Rp  " + bayar);
    }    
}
