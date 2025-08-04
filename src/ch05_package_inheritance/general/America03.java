package ch05_package_inheritance.general;

public class America03 extends Beverage03 {// 서브클래스 extends 슈퍼 클래스
    private double waterAmount;

    public America03(String name, double price, double waterAmount) {
        //super();// 부모의 생성자 호출
        super(name, price);

        this.waterAmount =waterAmount;
    }

    public void printInfo() {
        super.showInfo();
        System.out.println("투입된 물의양 "+ waterAmount);

    }
}
