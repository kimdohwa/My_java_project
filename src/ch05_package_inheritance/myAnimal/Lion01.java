package ch05_package_inheritance.myAnimal;

public class Lion01 extends Animal01{
    private int leg;

    public Lion01(String name, int lifespan, String habitat, int leg, int speed) {
        super(name, lifespan, habitat, speed);
        this.leg = leg;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        String msg = getName()+"의 다리 개수는 "+leg+"개입니다.";
        System.out.println(msg);
    }

    public void run(){
        String msg = super.getName()+"(이)가 "+getSpeed()+"의 속도로 달려 갑니다.";
       System.out.println(msg);
   }

}
