package ch01_variable_operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 3, b = 50 ;
        int result ;//= 조건식 ? 참일때 : 거짓일때 ;

        result = a >= b ? a-b : b-a ;

        System.out.println("절대 값 : " + result ) ;

        int x =10;// 짝수이면 ? x+3 : x*x
        result = x%2 == 0 ? x+3 : x*x ;

        System.out.println("result = " + result ) ;

        x = 50 ;
        int y = 50 ; // 두숫자중에 큰 숫자 뽑아내기

        result = x >= y ? x : y ;//x가 크거나 같으면 ? x : y
        System.out.println("큰수 = " + result ) ;

        result = x <= y ? x : y ;//x가 작거나 같으면 ? x : y
        System.out.println("작은수 = " + result ) ;

        result = x == y ? 123 : (x <= y ? x : y) ;







        System.out.println();
        // 답이 123 일때 "같다 출력"



        System.out.println("같을땐 123, 다를땐 작은수 = " + result ) ;

        //x가 y의 약수이면 yes, 아니면 no

        String 약수 ;

        x=6;
        y=13;

        약수= y%x == 0 ? "yes" : "no" ;
        System.out.println("x가 y의 약수이면 yes, 아니면 no = " + 약수) ;

        int su =7;
        String a1 ;
        a1 = su%2 ==0 ? "짝수" : "홀수" ;
        System.out.println("숫자"+ su + "는(은)" + a1 + "입니다.") ;
        // 숫자 7은(는) 홀수입니다.

        int score = 85;
        String b1 ;
        b1 = score >= 60 ? "합격" : "불합격" ;
        System.out.println(score + "점이므로 "+ b1 + "입니다.") ;
        // 60점 이상이면 합격 / 85점이므로 합격입니다.

    }}
