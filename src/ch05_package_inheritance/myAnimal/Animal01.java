package ch05_package_inheritance.myAnimal;

public class Animal01 {
    private String name ;
    private int lifespan;
    private String habitat;
    private int speed ;

    public Animal01() {
    }

    public Animal01(String name, int lifespan, String habitat, int speed) {
        this.name = name;
        this.lifespan = lifespan;
        this.habitat = habitat;
        this.speed = speed;
    }

    public void showInfo(){
        String msg = "평균수명이 "+ lifespan + "인 " + name + "의 ";
        msg += "서식지는 " + habitat + " 입니다." ;
        System.out.println(msg);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        String msg = "평균 수명이 "+ lifespan +"인 "+ name+"의 서식지는 "+  habitat +"입니다.";
        return msg;
    }


}
