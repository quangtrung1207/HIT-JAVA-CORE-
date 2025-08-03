import StudentVN.Bai1vn_Student;
public class bai1vn {
    public static void main(String[]args){
        int n=5;
        Bai1vn_Student[] s =new Bai1vn_Student[n];
        s[0]=new Bai1vn_Student("Trung",2006,"HaNoi",8.5,9,9,0);
        s[1]=new Bai1vn_Student("Dung",2006,"HaNoi",8,8,8,2);
        s[2]=new Bai1vn_Student("Dat",2006,"HoaBinh",7.5,6,8,0);
        s[3]=new Bai1vn_Student("Toan",2006,"HaNoi",9,8,8.5,1);
        s[4]=new Bai1vn_Student("Chinh",2006,"NamDinh",7,7,7.5,0);
        System.out.printf("%-10s%-10s%-15s%-12s%-12s%-15s%-10s%-18s\n", "Tên", "Tuoi", "Dia Chi", "Điem TX1", "Điem TX2", "Điem KTHP", "GPA", "So tiet nghi");
        for (int i=0; i<n; i++) {
            System.out.printf("%-10s%-10d%-15s%-12.1f%-12.1f%-15.1f%-10.2f%-18d\n",
                    s[i].getName(), s[i].getNamSinh(), s[i].getAddress(), s[i].getPoint1(), s[i].getPoint2(), s[i].getKTHP(), s[i].getGPA(), s[i].getSotietnghi());
        }
    }
}
