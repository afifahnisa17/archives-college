import java.util.Scanner;;

public class Percobaan2 {
    static int bilangan, pangkat;
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            
            System.out.print(x);
            if (y != 1) {
                System.out.print(" x ");
            } else {
                System.out.print(" x 1 = ");
            }
             return ( x * hitungPangkat(x, y-1));
        }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        System.out.print(hitungPangkat(bilangan, pangkat));
        
    }
    
}


