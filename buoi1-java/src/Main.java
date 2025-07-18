import java.util.Scanner;

public class Main {

    public static void hello(String name){
        System.out.println(name);
    }
    public static int tong (int a,int b){
        return a+b
;    }
    public static void mang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a :");
        int a = sc.nextInt();
        System.out.println("nhap so b :");
        int b = sc.nextInt();
        System.out.println("tong mang: "+(tong(a, b)));
    }
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap ten cua ban :");
        String name = sc.nextLine();
        System.out.println("hay nhap tuoi");
        int tuoi = sc.nextInt();
        int a=10;
        int b=3;
        System.out.println("tinh tong: "+(a+b));
        System.out.println("tinh hieu: "+(a-b));
        System.out.println(a*b);
        System.out.println((double)a/b);
        if (a>b){
            System.out.print ("a lon hon b");
        }
        else{
            System.out.print("a nho hon b");
        }
    }System.out.println("nhap n: ");
        int nhap =sc.nextInt();
        int[]numbers =new int [nhap];
        for(int i=0;i<nhap;i++){
            System.out.println("i="+i);
        }
        int tong=0;
        for(int i=0;i<nhap;i++){
            tong +=i;
        }System.out.print("tong "+tong);*/
        mang();
    }
}