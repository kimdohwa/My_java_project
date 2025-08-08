package ch06_abstract_interface.myshape.Cartest;

public abstract class Car implements Speed, Display, Radio{

    private String name ;
    private int price ;
    private Key key ; //열거형 상수

    protected int speed;

    protected void checkSpeed(){
        int maxSpeed = Speed.ALLOWED_MAX_SPEED;

        if (this.speed >= maxSpeed){
            Max();
            String msg = maxSpeed + "km 이상 과속하지마세요.";
            System.out.println(msg);
        }else if (this.speed == 0){
            String msg = "현재 속도: "+this.speed+"km"
                    +"\n차량이 멈췄습니다.";
            System.out.println(msg);
        }
    }

    protected void Max(){
        if (this.speed > Speed.ALLOWED_MAX_SPEED){
            String msg = "현재 속도: "+this.speed+"km"
            +"\n적정 속도로 낮춥니다.";
            System.out.println(msg);
            this.speed = Speed.ALLOWED_MAX_SPEED ;
        }
    }


    public Car(){}

    public Car(String name, int price, Key key){
        this.name = name;
        this.price = price;
        this.key = key;
    }

    public final void thrnOn(){
        String msg= this.key.getName() + "로 " + this.name + "의 시동을 켭니다.";
        System.out.println(msg);
    }

    public final void thrnOff(){
        String msg= this.name + "의 시동을 끕니다.";
        System.out.println(msg);
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        String msg = "이름: "+ name;
        msg +="\n단가: "+ price;
        msg +="\n열쇠 타입: "+ key;
        msg +="\n한글 이름: "+ key.getName();
        return msg; //>객체정보
    }
}
