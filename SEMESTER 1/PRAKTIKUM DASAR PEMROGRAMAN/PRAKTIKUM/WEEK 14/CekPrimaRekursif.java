import java.util.Scanner;

public class CekPrimaRekursif {
    static boolean isPrima(int n, int i) {
        if (i == 1) {
            return true;
        } else {
            if (n % i == 0) {
                return false;
            } else {
                return isPrima(n, i - 1);
            }
        }
    }

    static void cekBilanganPrima(int n) {
        if (n > 1 && isPrima(n, n / 2)) {
            System.out.println("Bilangan tersebut adalah bilangan prima.");
        } else {
            System.out.println("Bilangan tersebut bukan bilangan prima.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int n = sc.nextInt();
        cekBilanganPrima(n);
    }
}
