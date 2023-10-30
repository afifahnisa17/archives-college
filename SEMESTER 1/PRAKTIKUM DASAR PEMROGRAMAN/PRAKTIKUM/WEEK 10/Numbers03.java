import java.util.Arrays;
public class Numbers03 {
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][5]; //Panjang Array diatur sama yaitu 5 untuk setiap baris.
        // int[][] myNumbers = new int[3][];
        // myNumbers[0] = new int[5];
        // myNumbers[1] = new int[3];
        // myNumbers[2] = new int[1];

        for (int i = 0; i<myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        for(int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang bari ke-" + (i+1) + ": " + myNumbers[i]. length);
        }
    }
    
}
