package Java;

public class Sinhvien {
    public String maSinhVien;
    public String name;
    public int age;
    public int diem;

    public Sinhvien() {

    }

    public Sinhvien(String maSinhVien, String name, int age, int diem) {
        this.maSinhVien = maSinhVien;
        this.name = name;
        this.age = age;
        this.diem = diem;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }
    public void setMaSinhVien(String maSinhVien){
        this.maSinhVien = maSinhVien;
    }
}




