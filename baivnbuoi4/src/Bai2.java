import Student.Bai2_Student;

public class Bai2 {
    public static void main (String[]args){
        Bai2_Student s= new Bai2_Student("khuong toan",20);
        System.out.println("ten:"+s.getName()+" nam nay:"+ s.getAge()+"tuoi");
        s.setName("trung");
        s.setAge(19);
        System.out.println("ten:"+s.getName()+" nam nay:"+ s.getAge()+"tuoi");
    }
}
