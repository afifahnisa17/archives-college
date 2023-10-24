import java.util.Scanner;
public class Lat1 {
    public static void main(String[] args) {
        Scanner sc03 = new Scanner(System.in);

        System.out.println("Masukkan suhu : ");
        int suhu = sc03.nextInt();

        if (suhu<16) {
            System.out.println("Silakan menggunakan jaket");
        }
        if (suhu<20 ) {
            System.out.println("Silakan pakai baju tebal");
        }
        else {
            System.out.println("Silakan pakai topi");
        }
    }
}
