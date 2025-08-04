package ch05_package_inheritance.general;

public class Beverage03 {

    private String name;
    private double price;

    public Beverage03(String name, double price) {
    this.name = name;
    this.price = price;
    }

    protected void showInfo() {
        System.out.println("음료이름 "+ name);
        System.out.println("단가 "+ price);
    }
}
