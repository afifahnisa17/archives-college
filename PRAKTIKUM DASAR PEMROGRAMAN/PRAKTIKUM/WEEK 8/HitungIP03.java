import java.util.Scanner;

public class HitungIP03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan nama mata kuliah: ");
        String nama_mk = input.nextLine();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = input.nextInt();
        System.out.print("Masukkan indeks nilai (A/B+/B/C+/C/D/E): ");
        String nilai = input.nextLine();
        System.out.print("Masukkan jumlah SKS: ");
        int sks = input.nextInt();
        System.out.println("Apakah Anda lanjut input nilai? (Y/N)");
        char konfirmasi = 'Y';

        double total_bobot = 0;
        int total_sks = 0;
        int remidi = 0;
        double bobot;

        do {
            System.out.print("Masukkan nama mata kuliah: ");
            nama_mk = input.nextLine();
            System.out.print("Masukkan indeks nilai (A/B+/B/C+/C/D/E): ");
            nilai = input.nextLine();
            System.out.print("Masukkan jumlah SKS: ");
            sks = input.nextInt();

            switch (nilai) {
                case "A":
                    bobot = 4.0;
                    break;
                case "B+":
                    bobot = 3.5;
                    break;
                case "B":
                    bobot = 3.0;
                    break;
                case "C+":
                    bobot = 2.5;
                    break;
                case "C":
                    bobot = 2.0;
                    break;
                case "D":
                    bobot = 1.0;
                    remidi++;
                    break;
                default:
                    bobot = 0.0;
                    remidi++;
            } 

        } while (konfirmasi == 'y' || konfirmasi == 'Y'); {
            System.out.println("Apakah Anda lanjut input nilai? (Y/N)");
            konfirmasi = input.next().charAt(0);
            total_bobot += sks * bobot;
            total_sks += sks;
        

        double IP = total_bobot / total_sks;

        System.out.println("---------------Hasil Perhitungan IP---------------");
        System.out.println("\nNama mahasiswa: " + nama);
        System.out.printf("Indeks Prestasi (IP): %.2f\n", IP);
        System.out.println("Total mata kuliah: " + n);
        System.out.println("Total SKS: " + total_sks);
        System.out.println("Jumlah mata kuliah yang harus perbaikan/remidi: " + remidi);
        System.out.println("----------------------------------------------------");
    
        
}
}
}