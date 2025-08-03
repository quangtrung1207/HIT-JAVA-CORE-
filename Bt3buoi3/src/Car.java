public class Car {
    String brand;
    int maxSpeed;
    public Car(){

    }
    public Car (String brand,int maxSpeed){
        this.brand=brand;
        this.maxSpeed=maxSpeed;
    }
    public void run( String brand,int maxSpeed){
        System.out.println("xe"+brand+"dang chay voi toc do toi da "+maxSpeed);
    }
}
