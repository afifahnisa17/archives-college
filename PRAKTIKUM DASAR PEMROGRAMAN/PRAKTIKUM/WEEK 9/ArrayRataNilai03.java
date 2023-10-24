import java.util.*;

public class ArrayRataNilai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa :" );
        int banyak = sc.nextInt();
        int[] nilaiMhs = new int[banyak];
        double jumLulus = 0, jumTidakLulus = 0, rata2_lulus, rata2_tidaklulus;
        int lulus =0, tidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs [i] > 70) {
                lulus +=1;
                jumLulus += nilaiMhs[i];
                
            } else {
                tidakLulus +=1;
                jumTidakLulus += nilaiMhs[i];
            }
        }

        rata2_lulus = jumLulus/lulus;
        rata2_tidaklulus = jumTidakLulus/tidakLulus;
        System.out.println("Rata-rata nilai lulus = " + rata2_lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2_tidaklulus);
    }
    
}
