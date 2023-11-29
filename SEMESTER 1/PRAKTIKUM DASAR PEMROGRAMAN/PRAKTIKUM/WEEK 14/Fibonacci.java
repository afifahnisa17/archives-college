public class Fibonacci {
    
    static int BilanganFibonacci(int bulan) {
        
        if (bulan <= 2) {
            return (1);
        } else {
            return BilanganFibonacci(bulan-2) + BilanganFibonacci(bulan -1);
        }
    }

    public static void main(String[] args) {
        int bulan = 12;

        int jumlahPasanganMarmut = BilanganFibonacci(bulan);

        System.out.println("Pasangan marmut pada akhir bulan ke-12 adalah " + jumlahPasanganMarmut);
    }
}


