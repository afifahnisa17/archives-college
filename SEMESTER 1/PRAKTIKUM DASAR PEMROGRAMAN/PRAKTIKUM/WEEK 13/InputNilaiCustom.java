import java.util.Scanner;

public class InputNilaiCustom {
static String[] nama;
static int[][] dataMahasiswa;

    public static void  inputDataMahasiswa() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.println("Masukkan jumlah tugas: ");
        int jumlahTugas = sc.nextInt();

        dataMahasiswa = new int [jumlahMahasiswa][jumlahMahasiswa];
        nama = new String[jumlahMahasiswa];

        for (int i =0; i <jumlahMahasiswa; i++){
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            nama[i] = sc.next();

            System.out.println("Masukkan nilai tugas untuk " + nama[i] + ": ");
                for(int j=0; j < jumlahTugas; j++) {
                    System.out.print("Minggu ke-" + (j+1) + "= ");
                    dataMahasiswa[i][j]= sc.nextInt();
                }
                System.out.println(); 
        }
        
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

    public static void TampilkanData() {
        System.out.println("===============================");
        System.out.println("      DATA NILAI MAHASISWA     ");
        System.out.println("===============================");

        for (int i =0; i <dataMahasiswa.length; i++){
            System.out.println(" Nilai " + nama[i] + ": ");
                for(int j=0; j < dataMahasiswa[0].length; j++) {
                    System.out.print("Minggu ke-" + (j+1) + "= " + dataMahasiswa[i][j]);
                    System.out.println();
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
        inputDataMahasiswa();
        TampilkanData();
        MahasiswaNilaiTerbaik();
    }
}

