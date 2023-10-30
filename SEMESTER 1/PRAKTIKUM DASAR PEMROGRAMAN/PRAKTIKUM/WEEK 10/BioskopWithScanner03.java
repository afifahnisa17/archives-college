import java.util.Scanner;

public class BioskopWithScanner03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int baris, kolom, menu = 0, lagi;
        String nama, next;
        String[][] penonton = new String[4][2];
        
        while (menu != 3) {
            System.out.println("============================");
            System.out.println("Pilih menu :");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Masukkan nomor menu : ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama : ");
                        nama = sc2.nextLine();
                        System.out.print("Masukkan baris : ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom : ");
                        kolom = sc.nextInt();

                        if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                                System.out.println("Penonton " + nama + " berhasil ditambahkan ke kursi di Baris " + baris + " dan Kolom " + kolom + ".");
                            } else {
                                System.out.println("Kursi di Baris " + baris + " dan Kolom " + kolom + " sudah terisi.");
                                continue;
                            }


                            System.out.print("Input penonton lainnya? (y/n) : ");
                            next = sc2.nextLine();

                            if (next.equalsIgnoreCase("n")) {
                                break;
                            }
                        } else {
                            System.out.println("Kursi tidak tersedia. Masukkan nomor baris dan kolom yang valid.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Daftar penonton :");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            }else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                        }
                    }
                    }
                    break;
                default: 
                    break;
        }
    }
}
}
