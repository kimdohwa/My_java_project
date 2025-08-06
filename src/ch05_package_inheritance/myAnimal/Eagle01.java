package ch05_package_inheritance.myAnimal;

public class Eagle01 extends Animal01{
    private int wing;

    public Eagle01(String name, int lifespan, String habitat, int wing, int speed) {
        super(name, lifespan, habitat, speed);
        this.wing = wing;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        String msg =super.getName()+"의 날개 개수는 "+wing+"개입니다.";
        System.out.println(msg);
    }

    public void fly(){
        String msg = getName()+"(이)가"+getSpeed()+"의 속도로 날아다닙니다.";
        System.out.println(msg);
    }

}
