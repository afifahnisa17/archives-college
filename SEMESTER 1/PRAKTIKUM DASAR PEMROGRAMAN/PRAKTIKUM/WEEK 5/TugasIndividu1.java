import java.util.Scanner;

public class TugasIndividu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jarak;
        String MaleeWeapon, RangedWeapon;

        System.out.println("Menentukan senjata yang digunakan di game.");
        System.out.println("Masukkan jarak :");
        jarak = input.nextInt();

        if (jarak <= 5) {
            System.out.println("Senjata yang anda gunakan adalah Malee Weapon");
        } else {
            System.out.println("Senjata yang ada gunakan adalah Ranged Weapon");
        }
    }
}
