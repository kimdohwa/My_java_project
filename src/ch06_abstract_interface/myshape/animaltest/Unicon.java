package ch06_abstract_interface.myshape.animaltest;

public class Unicon extends Animal implements Bird, Horse {

    private String name;
    private String gender ;
    private String feed ;

    private int initspeed ; //>>초기속도

    public Unicon(String name, String gender, String feed) {
        this.name = name;
        this.gender = gender;
        this.feed = feed;

        if (this.gender == "M"){
            this.initspeed = Bird.speed ;
        } else {
            this.initspeed = Horse.speed ;
        }
    }

    @Override
    public void fly() {
        String message = "'"+this.name+"'이(가) 시속 '"+Bird.speed +"'으로 날아갑니다.";
        System.out.println(message);
    }

    @Override
    public void run() {
        String message = "'"+this.name+"'이(가) 시속 '"+Horse.speed +"'으로 달립니다.";
        System.out.println(message);
    }

    @Override
    public void eat() {
        String message = "'"+this.name+"'이(가) '"+ this.feed +"'(을)를 먹습니다.";
        System.out.println(message);
    }

    @Override
    public void flutter() {
        System.out.println("날개를 펄럭이지않습니다.");
    }

    public void diplay() {
        String message = "'"+this.name+"'의 초기속도는 '"+ this.initspeed+"'입니다.";
        System.out.println(message);
        this.run();
        this.eat();
        this.fly();
        this.flutter();
    }
}
