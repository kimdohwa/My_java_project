package ch04_class;

public class foodMain01 {
    public static void main(String[] args) {
        food01 waffle = new food01();

        waffle.이름 = "와플" ;
        waffle.맛 = "달다" ;
        waffle.종류 = "디저트" ;
        waffle.가격 = 5000 ;
        waffle.배달비 = 3000 ;

        waffle.정보();
        System.out.println(waffle.배달비포함가격());
        System.out.println(waffle.배달가능여부());
        System.out.println(waffle.지역("공주"));


        food01 pizza = new food01();

        pizza.이름 ="피자";
        pizza.맛 ="짜다";
        pizza.종류 ="양식";
        pizza.가격 =15000;
        pizza.배달비 =3500;

        pizza.정보();
        System.out.println(pizza.배달비포함가격());
        System.out.println(pizza.지역("서울"));

    }
}
