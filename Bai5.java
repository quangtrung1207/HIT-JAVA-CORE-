public class Bai5 {
    public static void main(String[] args) {
        // Bảng cửu chương của số 5
        System.out.println("Bảng cửu chương của số 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // Tính tổng các số chẵn từ 1 đến 100 bằng vòng lặp for
        int tongChan = 0;
        for (int i = 2; i <= 100; i += 2) {
            tongChan += i;
        }
        System.out.println("\nTổng các số chẵn từ 1 đến 100 : " + tongChan);

        // Tính tổng các số chẵn từ 1 đến 100 bằng vòng lặp while
        int tongChan2 = 0;
        int j = 2;
        while (j <= 100) {
            tongChan2 += j;
            j += 2;
        }
        System.out.println("Tổng các số chẵn từ 1 đến 100 : " + tongChan2);
    }
}