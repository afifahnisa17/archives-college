import java.util.Scanner;

public class UcapanTerimaKasih_03 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in te world.\n" + 
        "You inspired in me a love for learning and made me feel like I could askk you anything.");
    }

    public static void UcapanTambahan(String ucapanTambahan) {
        System.out.println(ucapanTambahan);

    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
        UcapanTambahan("You are always there for me, no matter what.");
    }
}


