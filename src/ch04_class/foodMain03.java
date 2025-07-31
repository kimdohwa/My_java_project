package ch04_class;

public class foodMain03 {
    public static void main(String[] args) {

        food03 waffle = new food03();
        food03 pizza = new food03();

        waffle.set이름("와플");
        waffle.set맛("달다");
        waffle.set종류("디저트");
        waffle.set가격(5000);
        waffle.set배달비(3000);
        waffle.setAr("광주");

        System.out.println("이름 : "+ waffle.get이름());
        System.out.println("맛 : "+ waffle.get맛());
        System.out.println("종류 : "+ waffle.get종류());
        System.out.println("가격 : "+ waffle.get가격());
        System.out.println("배달비 : "+ waffle.get배달비());
        System.out.println("배달비 : "+ waffle.getAr());

        System.out.println();

        pizza.set이름("피자");
        pizza.set맛("짜다");
        pizza.set종류("양식");
        pizza.set가격(15000);
        pizza.set배달비(4500);
        pizza.setAr("경기");


        System.out.println("이름 : "+ pizza.get이름());
        System.out.println("맛 : "+ pizza.get맛());
        System.out.println("종류 : "+ pizza.get종류());
        System.out.println("가격 : "+ pizza.get가격());
        System.out.println("배달비 : "+ pizza.get배달비());
        System.out.println("배달비포함금액 : "+ pizza.get배달비포함금액());
        System.out.println("배달비가능여부 : "+ pizza.get배달가능여부());
        System.out.println("배달비가능지역 : "+ pizza.getAr());

    }
}
