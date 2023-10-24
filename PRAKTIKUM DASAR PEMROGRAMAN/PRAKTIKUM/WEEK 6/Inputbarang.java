import java.util.Scanner;

public class Inputbarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenis_barang, golongan_Barang, nama_barang;
        int jumlah_barang;

        System.out.println("Masukkan nama barang : ");
        nama_barang = input.nextLine();
        System.out.println("Apakah termasuk barang basah? (basah/kering)");
        golongan_Barang = input.nextLine();
        System.out.println("Apakah jenis barang adalah kebutuhan dapur? (y/n)");
        jenis_barang = input.nextLine();
        System.out.println("Masukkan jumlah barang : ");
        jumlah_barang = input.nextInt();
        System.out.println("============================");
        
        if (jenis_barang.equalsIgnoreCase("y")) { 
            if (golongan_Barang.equalsIgnoreCase("basah")) { 
                System.out.println("Jumlah barang basah adalah " +  nama_barang + " berjumlah " + jumlah_barang  );
            } else
                System.out.println("Jumlah barang kering adalah " + nama_barang + " " + jumlah_barang);
        } else 
            System.out.println("Jumlah barang selain barang dapur : " + nama_barang + " " + jumlah_barang + " buah.");

    }

}
    

