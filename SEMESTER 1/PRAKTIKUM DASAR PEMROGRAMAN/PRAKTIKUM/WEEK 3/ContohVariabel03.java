public class ContohVariabel03 {
    public static void main(String[] args) {
        String hobySaya = "Membaca";
        boolean isPandai = true;
        char jenisKelamin = 'P';
        byte umurSaya = 18;
        double $ipk = 3.84, tinggi = 1.56;
        
        System.out.println(hobySaya);
        System.out.println("Apakah pandai?" + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umurSaya);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi)); 

    }
}