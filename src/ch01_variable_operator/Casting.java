package ch01_variable_operator;

public class Casting {
    public static void main(String[] args) {
        double d = 100;
        System.out.println("d: "+d);

        int i = (int)12.5 ;
        System.out.println("i : "+ i);

        System.out.println(14/5);

        System.out.println((double) 14/5);
        // (double)14 ->실수(명시적변환) 5->정수 ----> 5의 암시적변환으로 (실수*정수)->(실수*실수) ---->  14.0(명)*5.0(암)

        System.out.println((double) (14/5));

        int kor = 50, eng = 60 , math = 80 ;

        int total = kor+eng+math ;

        double average = total/3 ;

        System.out.println("총점 :"+ total);
        System.out.println("평균 :"+ average);

        char ch1 = 'c' ;
        char ch2 = 'a' ;

        boolean bool1 = ch1 > ch2 ; // 아미적 형변환 되므로 99>97
        System.out.println("bool1 :"+ bool1);

        int result ;
        result = ch1 - ch2 +5 ;

        System.out.println("result : " + result);

        char ch3 = 'D' ; // 대문자면 yes 아니면 no

        String str = ch3 >= 'A' && ch3 <= 'Z' ? "yes" : "no" ;//대문자 A보다 크거나 같고, 대문자 Z보다 작거나 같을때
        System.out.println("대문자 판단 : "+ str);





    }
}
