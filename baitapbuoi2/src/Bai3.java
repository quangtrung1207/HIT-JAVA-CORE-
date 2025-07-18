import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số nguyên thứ nhất: ");
        int số1 = input.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int số2 = input.nextInt();

        int tong = số1 + số2;
        int hieu = số1 - số2;
        int tich = số1 * số2;
        int thuong, du;
        if (số2 != 0) {
            thuong = số1 / số2;
            du = số1 % số2;
        } else {
            thuong = 0;
            du = 0;
        }

        System.out.println(số1 + " + " + số2 + " = " + tong);
        System.out.println(số1 + " - " + số2 + " = " + hieu);
        System.out.println(số1 + " x " + số2 + " = " + tich);
        System.out.println(số1 + " / " + số2 + " = " + thuong);
        System.out.println(số1 + " % " + số2 + " = " + du);


        if (số1 == số2) {
            System.out.println(số1 + " = " + số2);
        } else {
            System.out.println(số1 + " != " + số2);
        }
    }
}