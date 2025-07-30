package ch04_class;

public class SaramMain01 {
    public static void main(String[] args) {
        //2> 객체 생성
        // 클래스이름 객체이름(맘대로) = new 생성자이름() ;
        Saram01 yusin = new Saram01();

        Saram01 x;
        x = new Saram01() ;//> 많이쓰는방식

        //3> 객체의 멤버 변수에 쓰기작업
        //점(.)을 멤버참조연산자라고 부릅니다.
        yusin.nationality ="대한민국";
        yusin.name ="김유신";
        yusin.hobby ="당구";
        yusin.height =172.5;
        yusin.weight =72.5;


        //4> 출력
        System.out.println(yusin.nationality);
        System.out.println(yusin.name);
        System.out.println(yusin.height);
        System.out.println(yusin.weight);
        System.out.println(yusin.hobby);

        Saram01 soon = new Saram01();

        soon.nationality = "대한민국";

        System.out.println(soon.nationality);
        System.out.println(soon.name);
        System.out.println(soon.height);
        System.out.println(soon.weight);
        System.out.println(soon.hobby);

        System.out.println(yusin.showGenderInfo(2));

        String BMI ;
        BMI = yusin.showBmiInfo();
        System.out.println(BMI);

        yusin.display();
    }
}
