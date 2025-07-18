import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("nhập tên của bạn :");
       String name =sc.nextLine();
       System.out.println("nhap tuoi cua ban");
       int age =sc.nextInt();
       System.out.println("nhap chieu cao cua ban");
       int height =sc.nextInt();
       System.out.print("xin chao"+name+"ban"+age+"tuoi va chieu cao"+height+"met");
    }
}