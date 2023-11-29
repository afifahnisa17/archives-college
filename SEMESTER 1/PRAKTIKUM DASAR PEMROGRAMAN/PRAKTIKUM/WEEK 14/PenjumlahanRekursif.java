import java.util.Scanner;

public class PenjumlahanRekursif {
    static int PenjumlahanRekursif(int x) {
        if (x == 1) {
            return (1);
        } else {
            return x + PenjumlahanRekursif(x-1);
        }
        
    }

    static int PenjumlahanIteratif(int x) {
        int hasil = 0;
        for (int i = 0; i <= x; i++){
            hasil += i;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka yang ingin ditambahkan: ");
        int x = sc.nextInt();
        int hasil = PenjumlahanIteratif(x);
        for (int i = 1; i <=x; i++) {
            System.out.print(i);
            if (i < x) {
                System.out.print(" + ");
            }
        }
        System.out.print(" = " + hasil);

    }
}

