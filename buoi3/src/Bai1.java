import java.util.Scanner;
public class Bai1{
    public static void nhapmang(int []a,int n,Scanner sc){
        for(int i=0;i<n;i++){
            System.out.print("[a"+ i +"]:");
            a[i]=sc.nextInt();
        }
    }
    public static void tongchan(int[]a,int n){
        int tong =0;
        int dem =0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                tong +=a[i];
                dem++;
            }
        }System.out.println("Co"+dem+"sochan!Tong cac so chan la :"+ tong);
    }
    public static void tongle(int[]a,int n){
        int tong=0;
        int dem =0;
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                tong +=a[i];
                dem++;
            }
        }System.out.println("co"+dem+"so le! Tong cac so le la :"+ tong);
    }public static boolean kiemtra(int n){
        if(n<2)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if (n % i == 0) return false;
        }return true;
        }
    public static void soNT(int []a,int n){
        int dem=0;
        for(int i=0;i<n;i++){
            if(kiemtra(a[i])){
                dem++;
            }
        }System.out.println("co"+dem+"so nguyen to ! ");
    }
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("nhap so phan tu mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        nhapmang(a,n,sc);
        tongchan(a,n);
        tongle(a,n);
        soNT(a,n);
    }
}

    
