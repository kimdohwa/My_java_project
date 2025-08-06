package ch05_package_inheritance.mybeverage;

public class Latte04 extends Beverage04{
    private String milkType;

    public Latte04(String name, double price, String milkType){
        super(name, price);
        this.milkType = milkType ;
    }

    public void showInfo(){
        super.ShowInfo();
        String msg = "우유 타입 : "+ milkType ;
        System.out.println(msg);
    }

    public void enjoyLatte(){
        String msg = "부드럽고 크리미한 "+ super.getName() +"을(를) 마십니다.";
        System.out.println(msg);
    }
    @Override
    public String toString() {

        String mes = ",우유타입 : "+this.milkType;
        return super.toString()+mes;}
}
