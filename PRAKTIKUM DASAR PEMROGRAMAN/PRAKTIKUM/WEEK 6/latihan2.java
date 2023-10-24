import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Scanner input2 = new Scanner(System.in);
        int suhu;
        char hujan = 'y';

        System.out.println("Masukkan suhu :");
        suhu = input.nextInt();
        System.out.println("Hujan atau tidak? (y / n)");
        hujan = input2.next().charAt(0);
        
        if (suhu > 27) {
            System.out.println("Memakai dress");
            if (Character.toString(hujan).equals("y")) {
                System.out.println("Membawa payung");

            } else {
            System.out.println("Memakai Sunscreen");
            }

        } else 
        System.out.println("Memakai celana panjang");
        
    }
    
}
