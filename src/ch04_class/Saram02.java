package ch04_class;

public class Saram02 {
    //스테틱변수 = 클래스변수 = 정적변수
    static String nationality = "대한민국";

    //멤버변수(인스턴스 변수)
    String name;
    String hobby;
    String blood;
    double height;
    double weight;

    //double PI = 3.14 ; //인스턴스변수 (멤버변수)
    final double PI = 3.14 ;


    public void display() { // 멤버 메소드
        int total =0;
        //PI = 5.14 ;--> final 때문에 오류생김

        for (int i = 1; i < 11 ; i++) {
            total= total+i;
        }

        System.out.println("총합은 : "+total);

        System.out.println("국적 : " + nationality);
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("취미 : " + hobby);
        System.out.println("혈액형 : " + blood);


    }
}
