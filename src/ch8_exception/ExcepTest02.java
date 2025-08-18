package ch8_exception;

import java.util.Scanner;

public class ExcepTest02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        System.out.println("첫 번째 정수 입력 : ");
        int x = Integer.parseInt(scan.next()) ;

        try {
            System.out.println("두 번째 정수 입력 : ");
            int y = Integer.parseInt(scan.next()) ;
            System.out.println(x / y);
        }catch(NumberFormatException ex){
            System.out.println("올바른 숫자입력하세요");
        }catch (ArithmeticException ex){
            System.out.println("0으로 나누기 예외발생");
        }catch (Exception ex){
            System.out.println("기타 예외 발생");
        }finally {
            System.out.println("스캐너 닫습니다.");
            scan.close();
        }

        scan.close() ;
    }

}
