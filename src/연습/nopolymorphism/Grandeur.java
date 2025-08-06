package 연습.nopolymorphism;

public class Grandeur extends Car {

    private double economy ;

    public Grandeur( int price, String car, double economy) {
        super(price, car);
        this.economy = economy;
    }

    public String economyment(){
        String economyment="";

        if (economy>=20){
            economyment= "excellent";
        }else if (economy>=15){
            economyment= "good";
        }else {
            economyment= "poor";
        }
        return economyment;
    }

    @Override
    public void showInpo() {
        super.showInpo();
        String msg = "연비: " + economy;
        msg += "\n연비멘트: "+economyment();
        System.out.println(msg);
    }



}
