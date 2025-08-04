package ch05_package_inheritance.mybeverage;

public class InheTest04 {
    public static void main(String[] args) {

//승급 : 서브 클래스가 일시적으로 슈퍼클래스의 타입으로 변환이 되는 과정(업캐스팅)
        Beverage04 beverage01 = new Americano04("아메리카노",4000.0,250.0);

        //슈퍼 클래스 내에 있는 메소드는 상속 개념에 의하여 접슨이 가능합니다.
        beverage01.ShowInfo();

        // 승급시 서브 클래스내의 변수와 메소드는 일시적으로 접근을 하지 못하게 설계되어있습니다.
        //단, 강등을 하게되면 서브클래스 내의 변수와 메소드를 접근할수있습니다. int i =(int)3.14 형변환
        Americano04 ame = (Americano04)beverage01 ;
        ame.sipAmericano();


    }
}
