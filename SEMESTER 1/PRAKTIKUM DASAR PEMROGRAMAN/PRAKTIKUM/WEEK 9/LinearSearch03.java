import java.util.Scanner;
public class LinearSearch03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrayInt;
        System.out.print("Masukkan jumlah elemen array: " );
        int elemen = input.nextInt();
        arrayInt = new int[elemen];

        int hasil = 0;
        for (int i =0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" +i+": ");
            arrayInt[i] = input.nextInt(); 
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = input.nextInt();

        for (int i =0; i < arrayInt.length; i++) {
            if (arrayInt[i] ==key) {
                hasil = i;
                break;
            }
        }
        if (key == elemen) {
            System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan");
        }
        
    }
}
