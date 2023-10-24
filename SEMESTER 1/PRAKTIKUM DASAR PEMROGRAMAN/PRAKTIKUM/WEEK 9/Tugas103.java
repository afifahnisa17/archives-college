import java.util.Scanner;

public class Tugas103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int jumlah = sc.nextInt();
        int[] nilai = new int[jumlah];
        double sum = 0, rata2;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + " : ");
            nilai[i] = sc.nextInt();
        }
        int tinggi = nilai[0], rendah = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > tinggi) {
                tinggi = nilai[i];
            }
            if (nilai[i] < rendah) {
                rendah = nilai[i];
            }
            sum += nilai[i];
        }
        rata2 = sum / nilai.length;
        System.out.println("Rata-rata : " + rata2);
        System.out.println("Nilai tertinggi : " + tinggi);
        System.out.println("Nilai terendah : " + rendah);
    }
}

