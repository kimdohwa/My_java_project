package ch05_package_inheritance.mybeverage;

public class Americano04 extends Beverage04 {
    private double waterAmount;



    public Americano04(String name, double price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount;
    }

    public void showInfo() {
        super.ShowInfo();
        String msg = "물의 양 : " + waterAmount;
        System.out.println(msg);}


    public void sipAmericano() {
            System.out.println(getName() + "를(을) 홀짝 홀짝 마십니다.");
        }

    @Override
    public String toString() {

        String mes = ",물량 : "+this.waterAmount +"ml";
        return super.toString()+mes;
    }
}
