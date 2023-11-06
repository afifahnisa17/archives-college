import java.util.Scanner;

public class TugasIndividu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println("Nilai harus lebih dari 3");
        } else {
            for (int i = 1; i <= N; i++) {

                for (int space = 1; space <= N - i; space++) {
                    System.out.print(" ");
                }
                
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
            System.out.println();
        }

    }
    
}
}
