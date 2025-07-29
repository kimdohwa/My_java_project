package ch02_control_statement;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
        //스캐너 장치준비
        Scanner scan = new Scanner(System.in);

        int total =0;// 총점
        double average =0.0 ; // 평균
        int count = 0; // 실행 횟수

        while (true){
            System.out.print("점수입력 : ");
            int grade = scan.nextInt();
            //System.out.println("숫자 : "+grade);
                if (grade<=0) {
                System.out.println("음수 또는 0이어서 종료합니다.");
                break;
            }
            //양수가 아닌 경우 계산 x
            total = total+ grade ;
            count = count+1 ;
            average = (double)total/count ;
        }
        System.out.println("총점 : "+ total);
        System.out.println("실행횟수 : "+ count);
        System.out.println("평균 : "+ average);
    }
}
