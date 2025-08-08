package ch06_abstract_interface.myshape.animaltest;

public class UniconMain {
    public static void main(String[] args) {
        Unicon unidol = new Unicon("유니돌","M","당근");
        unidol.diplay();
        unidol.flutter();

        System.out.println();

        Unicon unisoon = new Unicon("유니순","F","건초");
        unisoon.diplay();

        // 다형성 테스트
        // unicon을 animal, horse, bird 타입으로 다뤄봅니다./ 애니몰을 새타이브로 바꿔 플라이

        Animal animal = new Unicon("다형성","M","사과");
        animal.eat();

        Horse horse = (Horse) animal;
        horse.run();

        Bird bird = (Bird) animal;
        bird.fly();

    }



}
