package Student;

public class Bai3_Car {
        String brand;
        int maxSpeed;

    public Bai3_Car(String brand,int maxSpeed ){
            this.brand=brand;
            this.maxSpeed=maxSpeed;
        }
        public void run(){
        System.out.println("Xe:"+brand+" dang chay toc do toi da: "+maxSpeed+"km/h");
    }
}