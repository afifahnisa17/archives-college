import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil1, bil2, bil3;

        System.out.println("Masukkan bilangan pertama: ");
        bil1 = input.nextInt();
        System.out.println("Masukkan bilangan kedua: ");
        bil2 = input.nextInt();
        System.out.println("Masukkan bilangan ketiga: ");
        bil3 = input.nextInt();

        if (bil1 > bil2) {
            if ( bil1 > bil3) 
                System.out.println("Bilangan terbesar " + bil1);
            else 
                System.out.println("Bilangan terbesar " + bil3);         
        } else 
        {
            if ( bil2 > bil3) 
                System.out.println("Bilangan terbesar " + bil2);
            else 
                System.out.println("Bilangan terbesar " + bil3);         
        }

    }
    
}
