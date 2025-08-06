package ch05_package_inheritance.mybeverage;

public class Espresso04 extends Beverage04 {
    private int shotCount;


    public Espresso04(String name, double price, int shotCount){
        super(name, price);
        this.shotCount = shotCount;
    }

    public void showInfo() {
        super.ShowInfo();
        String msg = "샷 개수 : " + shotCount;
        System.out.println(msg);}

    void drinkEspresso(){
        String msg = "맛이 진하고 강렬한 " + super.getName() + "을(를) 마십니다.";
        System.out.println(msg);
    }

    @Override
    public String toString() {

        String mes = ",물량 : " + this.shotCount + "개";
        return super.toString() + mes;
    }
}
