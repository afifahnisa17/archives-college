import java.util.Scanner;

public class WhileGaji03 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int jumlahKaryawan, jumlahJamLembur;
    double gajiLembur, totalGajiLembur;
    gajiLembur = 0;
    totalGajiLembur = 0;
    String jabatan;
    
    System.out.println("Masukkan jumlah karyawan: ");  
    jumlahKaryawan = scan.nextInt();
    scan.nextLine(); // Membersihkan newline character dari buffer

    int i = 0;

    while (i < jumlahKaryawan) {
        System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
        System.out.println("Masukkan jabatan karyawan ke-" + (i + 1) + ": ");
        jabatan = scan.nextLine();
        System.out.println("Masukkan jumlah jam lembur: ");
        jumlahJamLembur = scan.nextInt();
        scan.nextLine(); // Membersihkan newline character dari buffer
        i++;
    

        if (jabatan.equalsIgnoreCase("direktur")) {
            continue;
        } else if (jabatan.equalsIgnoreCase("manager")) {
            gajiLembur = jumlahJamLembur * 100000;
        } else if (jabatan.equalsIgnoreCase("karyawan")) {
            gajiLembur = jumlahJamLembur * 75000;
        } else {
        System.out.println("Jabatan invalid");
            continue; // Kembali ke awal loop saat jabatan tidak valid
        }

    }
        totalGajiLembur += gajiLembur;
        System.out.println("Total gaji lembur: " + totalGajiLembur);

    
    }
}   
    

    