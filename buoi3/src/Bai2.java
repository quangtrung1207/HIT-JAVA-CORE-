import java.util.Scanner;

public class Bai2 {
    public static void main (String[]args){
        final double PI = 3.14159265;
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap ban kinh r :");
        double r=sc.nextDouble();
        System.out.println("Nhap so mu k:");
        int k=sc.nextInt();
        double chuvi=2 * PI * r;
        double dientich = PI * r * r;
        double mMuk = Math.pow(r,k);
        double can2 = Math.sqrt(r+k);
        double tritd = Math.abs(r-k);
        System.out.printf("Chu vi hinh tro:%.2f%n",chuvi);
        System.out.printf("Dien tich hinh tro:%.2f%n",dientich);
        System.out.printf("Can bac 2 cua (r+k):%.2f%n",can2);
        System.out.printf("Tri tuyet doi cua (r-k):%.2f%n",tritd);
        System.out.printf(" r mu k :%.2f%n",mMuk);
        sc.close();
    }
}
