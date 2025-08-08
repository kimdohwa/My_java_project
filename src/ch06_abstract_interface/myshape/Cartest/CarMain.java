package ch06_abstract_interface.myshape.Cartest;

public class CarMain {
    public static void main(String[] args) {
        Car[] mycar = {
                new Avante("아반떼",100,Key.KEY,"가장 많은 판매"),
                new Sonata("소나타",300,Key.SMART,"Hyundai"),
                new Grandeur("그랜져",200,Key.SMART,9.5)
        };


        for (int i = 0; i < mycar.length; i++) {
            mycar[i].thrnOn();
            Radio.sayHello(mycar[i].getName(),2);
            Radio.play(Frequency.FM,91.9);
            System.out.println(mycar[i]);
            //"객체를 출력"한다는것은 암시적으로 toString() 메소드를 호출합니다.
            mycar[i].speedUP(20);
            mycar[i].display();
            mycar[i].speedDOWN(20);
            mycar[i].speedUP(70);
            mycar[i].display();

            mycar[i].thrnOff();



            System.out.println("=================================================");
        }

    }
}
