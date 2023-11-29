public class BubbleSortExample03 {
    public static void main(String[] args) {
        int[] intData = {34, 18, 87, 72, 32, 54, 43};
        int temp = 0;

        // Bubble Sort
        for (int i = 0; i < intData.length; i++) {
            for (int j = 1; j < intData.length - i; j++) {
                if (intData[j - 1] < intData[j]) {
                    // Swap elements
                    temp = intData[j];
                    intData[j] = intData[j - 1];
                    intData[j - 1] = temp;
                }
            }
        }

        // Menampilkan hasil pengurutan
        System.out.println("Hasil pengurutan: ");
        for (int i = 0; i < intData.length; i++) {
            System.out.println(intData[i]);
        }

        // Menampilkan nilai tertinggi dan terendah
        int nilaiTertinggi = intData[0];
        int nilaiTerendah = intData[intData.length - 1];

        System.out.println();
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
    }
}
