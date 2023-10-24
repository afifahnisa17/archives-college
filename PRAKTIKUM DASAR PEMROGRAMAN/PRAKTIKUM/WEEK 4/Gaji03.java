import java.util.Scanner;

public class Gaji03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, JmlTdkMasuk, Gaji, potGaji, TotGaji;
        
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda");
        JmlTdkMasuk=input.nextInt();
        System.out.println("Masukkan besaran gaji anda ");
        Gaji=input.nextInt();
        System.out.println("Masukkan potongan gaji anda ");
        potGaji=input.nextInt();

        TotGaji=(jmlMasuk*Gaji)-(JmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah " + TotGaji);
    }
}