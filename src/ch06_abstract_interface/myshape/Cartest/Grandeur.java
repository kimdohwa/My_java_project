package ch06_abstract_interface.myshape.Cartest;

public class Grandeur extends Car{

    private double fuel ;
    private String remark ;

    public Grandeur(String name, int price, Key key, double fuel) {
        super(name, price, key);
        this.fuel = fuel;
    }

    @Override
    public void display() {
        String msg = super.getName() + "의 현재속도: "+ super.speed + "km";
        System.out.println(msg);
    }

    @Override
    public void speedUP(int speed) {
        super.speed = super.speed + speed ;
        super.checkSpeed();
    }

    @Override
    public void speedDOWN(int speed) {
        super.speed -= speed ;
        super.checkSpeed();
    }

    @Override
    public String toString() {
        if (fuel >= 20.0){
            remark="excellent";
        }else if(fuel >= 15.0){
            remark="good";
        }else {
            remark="poor";
        }

        return super.toString()+"연비: "+fuel+"\n연비메모: "+remark;
    }
}
