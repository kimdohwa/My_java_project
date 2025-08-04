package ch05_package_inheritance.mybeverage;

public class Americano04 extends Beverage04 {
    private double waterAmount;
    private String name;



    public Americano04(String name, double price, double waterAmount) {
        super(name,price);
        this.waterAmount = waterAmount;
        this.name = name ;
    }


    public void sipAmericano(){
        System.out.println( name + "를(을) 홀짝 홀짝 마십니다.");
    }
}
