import java.util.Scanner;

public class Bai3 {
    public static void main (String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.print("nhap chuoi :");
        String s = sc.nextLine();
        String xoa =s.trim();
        System.out.println("xoa khoang trang trong chuoi "+xoa);
        boolean check =true;
        int trai =0,phai =s.length()-1;
        while (trai<phai){
            String kttrai = String.valueOf(s.charAt(trai));
            String ktphai = String.valueOf(s.charAt(phai));
            check =kttrai.equalsIgnoreCase(ktphai);
            if(!check){
                break;
            }
            trai++;
            phai--;
        }if (check) {
            System.out.println("Chuoi la doi xung!");
        } else {
            System.out.println("Chuoi la khong doi xung!");
        }

        System.out.print("Chuoi dao nguoc: ");
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }

        sc.close();
    }
}
