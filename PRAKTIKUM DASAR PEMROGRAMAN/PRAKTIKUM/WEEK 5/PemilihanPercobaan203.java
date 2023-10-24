import java.util.Scanner;

public class PemilihanPercobaan203 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);

        System.out.println("Nilai uas   : ");
        float uas = input03.nextFloat();
        System.out.println("Nilai uts   : ");
        float uts = input03.nextFloat();
        System.out.println("Nilai kuis  : ");
        float kuis = input03.nextFloat();
        System.out.println("Nilai tugas : ");
        float tugas = input03.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);

        if (total > 80 && total <= 100) { 
            System.out.println("Nilai A");
            System.out.println("Nilai setara 4");
        } else if (total > 73 && total <= 80) { 
            System.out.println("Nilai B+");
            System.out.println("Nilai setara 3,5");
        } else if (total > 65 && total <= 73) { 
            System.out.println("Nilai B");
            System.out.println("Nilai setara 3");
        } else if (total > 60 && total <= 65) { 
            System.out.println("Nilai C+");
            System.out.println("Nilai setara 2,5");
        }else if (total > 50 && total <= 60) { 
            System.out.println("Nilai c");
            System.out.println("Nilai setara 2");
        }else if (total > 39 && total <= 50) { 
            System.out.println("Nilai D");
            System.out.println("Nilai setara 1");
        } else { 
            System.out.println("Nilai E");
            System.out.println("Nilai setara 0");
        }
    
}
}