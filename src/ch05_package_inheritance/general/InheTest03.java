package ch05_package_inheritance.general;

public class InheTest03 {
    public static void main(String[] args) {
    America03 america = new America03("아메리카노",4000.0,200.0);

    Espresso03 espresso = new Espresso03("에스프레소",5000.0,2);

        Latte03 latte = new Latte03("라떼",6000.0,"아몬드우유");

    america.printInfo();
    espresso.printInfo();
    latte.printInfo();
    }
}

