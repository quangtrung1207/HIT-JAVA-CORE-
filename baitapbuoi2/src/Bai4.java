import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] intso = new int[5];

        System.out.print("Nhập mảng: ");
        for (int i=0; i<5; i++) {
            intso[i] = sc.nextInt();
        }

        System.out.print("Mảng vừa nhập là: ");
        int sum = 0;
        for (int i=0; i<5; i++) {
            System.out.print(intso[i] + " ");
            sum += intso[i];
        }
        System.out.println();
        System.out.println("Tổng của các phần tử trong mảng: " + sum);

        int max = intso[0];
        for (int i=1; i<5; i++) {
            if (max < intso[i]) {
                max = intso[i];
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng: " + max);
    }
}