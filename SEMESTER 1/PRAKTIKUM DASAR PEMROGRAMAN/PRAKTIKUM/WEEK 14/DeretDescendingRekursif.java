import java.util.Scanner;

public class DeretDescendingRekursif {
    static void  DeretDescendingRekursif(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            DeretDescendingRekursif(n-1);
        } else {
            System.out.print(0);
        }
    }

    static void DeretDescendingIteratif(int n) {
        System.out.print(n + " ");
        for (int i =n; i >= 1; i--) {
            n -= 1;
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka yang ingin di urutkan: ");
        int n = sc.nextInt();
        System.out.println("Deret Descending rekursif: ");
        DeretDescendingRekursif(n);
        System.out.println();
        System.out.println("Deret Descending Iteratif: ");
        DeretDescendingIteratif(n);
    }
}


