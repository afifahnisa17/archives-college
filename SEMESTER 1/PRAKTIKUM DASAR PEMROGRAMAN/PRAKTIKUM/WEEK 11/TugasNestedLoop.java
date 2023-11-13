import java.util.Scanner;

public class TugasNestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan N : ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            // Cetak spasi sebelum karakter '*'
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // Cetak karakter '*' sesuai dengan nilai i
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println(); // Pindah ke baris berikutnya
        }

        for (int i = N; i >= 1; i--) {
            // Cetak spasi sebelum karakter '*'
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // Cetak karakter '*' sesuai dengan nilai i
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println(); // Pindah ke baris berikutnya
        }
        
    }
    
}
