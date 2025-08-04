package ch05_package_inheritance.general;

public class Latte03 extends Beverage03 {
    private String milktype ;

    public Latte03(String name, double price, String milktype){
        super(name, price);
        this.milktype = milktype ;
    }

    public void printInfo() {
        super.showInfo();
        System.out.println("우유 타입 "+milktype);
    }
}
