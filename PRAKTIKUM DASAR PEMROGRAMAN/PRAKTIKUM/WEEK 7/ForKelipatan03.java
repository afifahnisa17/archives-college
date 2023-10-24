import java.util.Scanner;  //Menambah library scanner untuk user dapat menginput data

public class ForKelipatan03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan, counter, total; //Inisialisasi variabel menggunakan tipe data int
        int jumlahKelipatan = 0;
        total = 0; 
        counter = 0;


        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt(); 
        

        //Menggunakan perulangan for dengan dimulai inisialisasi i = 1, kondisi jika i <= 50, dan menggunakan i increment 
        //Menggunakan if jika nilai i dibagi kelipatan sama dengan 0, maka total akan bertambah 1, dan mulai menghitung
        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) { 
                total += i;
                counter++;
            }
        }

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlahKelipatan++;
            }
        }

        double rata2 =(double) total/jumlahKelipatan; // menambah variabel baru untuk menghitung rata-rata
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d  dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata-rata bilangan kelipatan "+ kelipatan + " dari 1 sampai 50 adalah " + rata2 );
        
    }
}
