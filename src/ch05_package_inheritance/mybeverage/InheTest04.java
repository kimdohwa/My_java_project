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
        ame.showInfo();

        Beverage04 beverage02 = new Espresso04("에스프레소",5000.0,2);
        beverage02.ShowInfo();

        Espresso04 esso = (Espresso04)beverage02;
        esso.drinkEspresso();

        Beverage04 beverage03 = new Latte04("라떼",6000.0,"아몬드우유");

        Latte04 lat = (Latte04)beverage03;
        ((Latte04) beverage03).showInfo();
        lat.enjoyLatte();

        System.out.println("***********");

        //배열 초기화 기법 : 타입[] 배열이름 = {요소1,요소2....};
        Beverage04[] beverage = {
                beverage01,
                new Espresso04("마이뿌레소",2000.0,1),
                new Latte04("바나나라떼",3000.0,"바나나 우유")
        };

        for (int i = 0; i < beverage.length; i++) {

            if(beverage[i] instanceof Americano04){
                System.out.println(beverage01.toString());
                Americano04 zzz = (Americano04)beverage[i];
                zzz.sipAmericano();
                System.out.println("--------------------------------");
            } else if(beverage[i] instanceof Espresso04){
                System.out.println(beverage02.toString());
                Espresso04 xxx = (Espresso04)beverage[i];
                xxx.drinkEspresso();
                System.out.println("--------------------------------");
            } else if(beverage[i] instanceof Latte04){
                System.out.println(beverage03.toString());
                Latte04 yyy = (Latte04)beverage[i];
                yyy.enjoyLatte();
                System.out.println("--------------------------------");
            }
        }
    }
}
