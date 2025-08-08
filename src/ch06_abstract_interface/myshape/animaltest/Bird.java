package ch06_abstract_interface.myshape.animaltest;

public interface Bird {

    int speed = 300 ;//> == public static final int speed = 300

    void fly();//>> = public abstract void fly(); 퍼블릭추상메소드만 사용가능

    default void flutter(){// 기본 동작 정의
        System.out.println("날개를 펄럭입니다.");
    }
}
