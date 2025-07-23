package ch01_variable_operator;

public class AreaTest {
    public static void main(String[] args) {
        //갯수 3 타입 더블

        double 반지름, 원주율, 면적 ;

        반지름 = 10.0 ;
        원주율 = 3.14 ;
        면적 = 반지름*반지름*원주율 ;

        System.out.println("반지름이 "+ 반지름+ "일 때 원의 면적은 "+ 면적 + "입니다.");

    }
}
