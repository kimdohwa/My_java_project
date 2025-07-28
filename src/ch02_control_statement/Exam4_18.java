package ch02_control_statement;

public class Exam4_18 {
    public static void main(String[] args) {
        int su = 1 ;
        for (int i = 1; i <8 ; i++) {
            System.out.println(i+"의 제곱은"+(i*i)+"입니다.");

        }

        int su01 =3 ;
        int su02 = 10 ;
        int total = 0 ;
//3~7까지의 합
        for (int i = su01 ; i <= su02 ; i++) {
            total += i ;
        }
        System.out.println(su01+"부터"+su02+"까지의 합은 "+total+"입니다.");
    }
}
