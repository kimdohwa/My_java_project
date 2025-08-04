package ch05_package_inheritance.general;

public class Espresso03 extends Beverage03 {
    private int shotCount ;

    public Espresso03(String name,double price, int shotCount){super(name, price);

    this.shotCount = shotCount;
    }

    public void printInfo() {
        super.showInfo();
        System.out.println("샷 개수 "+ shotCount);

    }
}
