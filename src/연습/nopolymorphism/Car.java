package 연습.nopolymorphism;

public class Car {
    private int price ;
    private String car ;

    public Car(){}

    public Car(int price, String car) {
        this.price = price;
        this.car = car;
    }

    public void showInpo(){

        String msg ="\n가격: "+ price +"원\n차량: "+ car +" 시승";
        System.out.println(msg);
    }

    public double tax(){
        double tax = 0.0;
        if (this.price>= 150){
             tax = price * 0.1;
        } else {
             tax = price * 0.05;
        }
        return tax;
    }

    public void taxInpo(){
        System.out.println("세금: "+tax()+"원");
    }

}
