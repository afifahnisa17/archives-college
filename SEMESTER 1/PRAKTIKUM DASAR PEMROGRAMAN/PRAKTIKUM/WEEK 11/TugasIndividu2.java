import java.util.Scanner;

public class TugasIndividu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        if (N < 5) {
            System.out.println("Nilai N harus minimal 3");
            return;

        }
            int i =N;
            while (i>=1) {
                int j = 1;
                while (j<=i) {
                    System.out.print("*");
                    j++;
                }
                    System.out.println();
                    i--;
        }
        
        
    }
    
}