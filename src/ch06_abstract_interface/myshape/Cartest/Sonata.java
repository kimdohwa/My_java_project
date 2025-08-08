package ch06_abstract_interface.myshape.Cartest;

public class Sonata extends Car{

    private String maker ;

    public Sonata(String name, int price, Key key, String maker) {
        super(name, price, key);
        this.maker = maker;
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
        return super.toString()+"메이커: "+maker;
    }
}
