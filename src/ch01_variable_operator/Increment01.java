package ch01_variable_operator;

public class Increment01 {
    public static void main(String[] args) {
        int x =5 ;

        x += 3; //x = x+3 ; 누적할당
        System.out.println("x : "+x);

        x *= 4; //x = x * 4 ; 누적할당-->x는 윗줄의 x로 변경되었기때문에 값은 8값
        System.out.println("x : "+x);//32

        x %= 5;
        System.out.println("x : "+x);//2

        x -= 1;
        System.out.println("x : "+x);//1

        x += 7;
        System.out.println("x : "+x);//8

    }}
