package ch8_exception;

public class MyException01 {
    public static void main(String[] args) {
        int x = 3, y = 0;
        int[] arr = {10, 20, 30};

        try {
            arr[3] = 50; //배열 요소 인덱스 문제
            System.out.println(x / y); //0으로 나누기 문제
        } catch (ArithmeticException ex) {
            System.out.println("0으로 나누면안됩니다.");

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("배열 인덱스 초과 오류 발생");
            System.out.println("예외 객체 정보확인");
            System.out.println("관련 메시지"+ ex.getMessage());
            System.out.println("관련 메시지"+ ex.toString());

            ex.printStackTrace(); //오류내용 프린트

        } catch (Exception ex) {
            System.out.println("기타 다른 예외 발생");
        }finally {
            System.out.println("여기는 예외 발생여부와 상관없이 무조건 실행됩니다.");
            System.out.println("파일닫기, 데이터 베이스 접속종료 ");
        }
    }
}

