package ch06_abstract_interface.myshape.Cartest;

public class Avante extends Car {

    private String comment ;

    public Avante(String name, int price, Key key,String comment) {
        super(name,price,key);
        this.comment = comment;
    }

    @Override//인터페이스
    public void display() {
        String msg = super.getName() + "의 현재속도: "+ super.speed + "km";
        System.out.println(msg);
    }

    @Override//인터페이스
    public void speedUP(int speed) {
        super.speed = super.speed + speed ;
        super.checkSpeed();
    }

    @Override//인터페이스
    public void speedDOWN(int speed) {
        super.speed = super.speed - speed ;
        super.checkSpeed();
    }

    @Override//오브젝트
    public String toString() {
        return super.toString()+ "\n코멘트: "+ comment;
    }


}
