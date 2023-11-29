import java.util.Scanner;

public class Kubus03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = sc.nextInt();

        int Vol = hitungVolume(sisi);
        System.out.println("Volume kubus tersebut adalah " + Vol + " cm3");
        int LuasPermukaan = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus tersebut adalah " + LuasPermukaan + " cm2");
        sc.close();
    }

    static int hitungVolume(int sisi) {
        int Volume = sisi * sisi * sisi;
        return Volume;
    }

    static int hitungLuasPermukaan(int sisi) {
        int LuasPermukaan = 6 * sisi * sisi;
        return LuasPermukaan;
    }
    
}
