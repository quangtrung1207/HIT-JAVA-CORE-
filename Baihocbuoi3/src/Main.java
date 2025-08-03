import Java.Sinhvien;

public class Main {
    public static void main (String[]agrs){
        Student sinhVienA =new Student();
        sinhVienA.maSinhVien ="2024606075";
        sinhVienA.age = 19;
        sinhVienA.name="Dang Quang Trung0";
        System.out.println(sinhVienA.name);
        System.out.println(sinhVienA.maSinhVien);
        System.out.println(sinhVienA.age);
        Sinhvien a= new Sinhvien();
        a.name = "trung";
        a.age = 19;
        a.diem =10;
        a.maSinhVien ="2024606075";
    }
}
