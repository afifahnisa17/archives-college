import java.util.Scanner; 

public class Pertanyaan1 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        System.out.println("Masukkan Angka:  ");
        int angka = input03.nextInt();
    
        String total = angka / 2 == 0  ? "Bilangan genap" : "Bilangan Ganjil";
        System.out.println( angka + " adalah " + total);
        
    }
}