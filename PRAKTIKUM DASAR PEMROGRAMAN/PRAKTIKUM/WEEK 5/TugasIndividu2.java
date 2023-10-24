import java.util.Scanner;

public class TugasIndividu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usernameBenar = "clovertie";
        String passwordBenar = "12345";
        String Password, Username;

        System.out.println("Masukkan Username :");
        Username = input.nextLine();
        System.out.println("Masukkan Password :");
        Password = input.nextLine();

        if (Username.equals(usernameBenar) && Password.equals(passwordBenar)) {
            System.out.println("Login Berhasil");
        } else {
            System.out.println("Login anda gagal");
        }
    }
    
}
