import java.util.Scanner;

public class InputNilai {
static String[] nama = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
static int[][] dataMahasiswa = new int[5][7];

    public static int[][] inputDataMahasiswa() {
        Scanner sc = new Scanner(System.in);
        
        for (int i =0; i <nama.length; i++){
            System.out.println(nama[i]);
                for(int j=0; j < dataMahasiswa[0].length; j++) {
                    System.out.print("Minggu ke-" + (j+1) + "= ");
                    dataMahasiswa[i][j]= sc.nextInt();
                }

                System.out.println(); 
        }
        return dataMahasiswa;
    }

    public static void MencariNilaiTertinggi () {
        int NilaiTertinggi = dataMahasiswa[0][0];
        int indeksNilaiTertinggi = 0;
        String MahasiswaNilaiTerbaik = nama[0];

        for (int i =1; i <dataMahasiswa.length; i++) {
            for (int j = 0; j < dataMahasiswa[0].length; j++) {
                if (dataMahasiswa[i][j] > NilaiTertinggi) {
                    NilaiTertinggi = dataMahasiswa[i][j];
                    indeksNilaiTertinggi = j;
                    MahasiswaNilaiTerbaik = nama[i];
                }
            }
        }

        System.out.println("Mahasiswa dengan Nilai tertinggi: "  + MahasiswaNilaiTerbaik);
        System.out.println("Nilai tertinggi adalah " + NilaiTertinggi + " pada minggu ke- " + (indeksNilaiTertinggi + 1));
    }

    public static void TampilkanData(int[][] dataMahasiswa) {
        System.out.println("===============================");
        System.out.println("      DATA NILAI MAHASISWA     ");
        System.out.println("===============================");
        String[] nama = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
        for (int i = 0; i < dataMahasiswa.length; i++) {
        System.out.print(nama[i] + " : ");
        for (int j = 0; j < dataMahasiswa[0].length; j++) {
            System.out.print(dataMahasiswa[i][j]);
            if (j < dataMahasiswa[0].length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    }

    public static void MahasiswaNilaiTerbaik() {
        System.out.println();
        System.out.println("=================================");
        MencariNilaiTertinggi();
        System.out.println("=================================");
        
    }
    
    public static void main(String[] args) {
        int [][] dataMahasiswa = inputDataMahasiswa();
        TampilkanData(dataMahasiswa);
        MahasiswaNilaiTerbaik();
    }
}

