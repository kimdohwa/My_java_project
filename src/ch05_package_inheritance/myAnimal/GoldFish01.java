package ch05_package_inheritance.myAnimal;

public class GoldFish01 extends Animal01{
    private int gill;

    public GoldFish01(String name, int lifespan, String habitat, int gill, int speed) {
        super(name, lifespan, habitat, speed);
        this.gill = gill;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        String msg= super.getName() + "의 아가미 갯수는" + gill + "개입니다.";
        System.out.println(msg);
    }

    public void swim(){
        String msg = super.getName()+"(이)가 "+super.getSpeed()+"의 속도로 헤엄칩니다.";
        System.out.println(msg);
    };
}
