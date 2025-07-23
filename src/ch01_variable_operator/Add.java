package ch01_variable_operator;

public class Add {
    public static void main(String[] args) {
        //변수선언 (정의)
        int x; //정수형 데이터를 위하여 변수 x를 준비해 주세요.
        int y;
        int z;

        x=3; //x라는 곳에 숫자 3을 할당(대입)해주세요.(write)
        y=5;
        z=x+y; // x,y를 읽어와서 z에 할당

        String message ; //문자열 데이터를 위하여 변수 message를 준비해 주세요.

        message=x + " 더하기 "+ y + "은(는) "+ z + "입니다.";
        // + 기호의 2가지역할 : (1)덧셈, (2)문자열 결합

        System.out.println(message);

        x=4; // 재 선언
        y=8;
        z=x*y;

        message = x+" 곱하기 "+y+"은(는) "+z+"입니다.";

        System.out.println(message);

    }
}
