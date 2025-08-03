package StudentVN;

public class Bai1vn_Student {
    private String name;
    private int namsinh;
    private String address;
    private double point1;
    private double point2;
    private double KTHP;
    private int sotietnghi;
    public Bai1vn_Student(String name,int namsinh,String address,double point1,double point2,double KTHP,int sotietnghi){
        this.name=name;
        this.namsinh=namsinh;
        this.address=address;
        this.point1=point1;
        this.point2=point2;
        this.KTHP=KTHP;
        this.sotietnghi=sotietnghi;
    }
    public String getName(){
        return name;
    }
    public int getNamSinh(){
        return namsinh;
    }
    public String getAddress(){
        return address;
    }
    public double getPoint1(){
        return point1;
    }
    public double getPoint2(){
        return point2;
    }

    public double getKTHP() {
        return KTHP;
    }
    public int getSotietnghi() {
        return sotietnghi;
    }
    public double getGPA(){
        return point1*0.2+point2*0.3+KTHP*0.5;
    }
}
