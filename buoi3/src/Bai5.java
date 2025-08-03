import java.util.Scanner;
public class Bai5 {
    public static int[][] matranxoanoc (int n){
        int [][]a=new int [n][n];
         int gt=1;
         int top=0,bot=n-1;
         int lef =0,rig =n-1;
         while (gt<=n*n){
             for (int i=lef;i<=rig;i++){
                 a[top][i]=gt++;
             }
             top++;
             for(int i=top;i<=bot;i++){
                 a[i][rig]=gt++;
             }
         rig--;
         for(int i=rig;i>=lef;i--){
             a[bot][i]=gt++;}
         bot--; for (int i = bot; i >= top; i--) {
            a[i][lef] = gt++;
        }
        lef++;}


        return a;
}

    public static void xuatMaTran(int[][] a, int n) {
        int cheoChinh = 0, cheoPhu = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j) {
                    cheoChinh += a[i][j];
                }
                if(j==n-1-i) {
                    cheoPhu += a[i][j];
                }
                System.out.printf("%d ", a[i][j]);
            }System.out.println();
        }
        System.out.println("Tong cac phan tu tren cheo chinh: " + cheoChinh);
        System.out.println("Tong cac phan tu tren cheo phu: " + cheoPhu);

    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Nhap kich thuoc n: ");
            int n = sc.nextInt();
            int[][] Res = matranxoanoc(n);
            System.out.println("Ma tran xoan oc:");
            xuatMaTran(Res, n);
        }
    }
}

