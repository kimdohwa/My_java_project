package ch02_control_statement;

public class For01 {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i <= 10; i++) {
            total += i;
        }
        System.out.println("총합 01 : " + total);

        total = 0;

        //초기식 --> int i = 1 ; (딱 한번만 실행됨)
        //조건식 --> i < 101 ;
        //증감식 --> i가 3씩 커지는 조건(i+3)

        for (int i = 1; i < 101; i += 3) { //i=1 이 100이 될때까지 i+3을 반복한다

            total = total + i;

        }

        System.out.println("총합 02 : " + total);

        total = 0;

        for (int i = 97; i > 1; i = i - 5) {
            total = total + i;//--> total += i // total 이 0부터 시작되므로 첫 total 값은 i 값과 같다
        }
        System.out.println("총합 03 : " + total);

        total = 0;

        for (int i = 1 ; i < 97; i += 5){
            total= total+i*i ;
        }
        System.out.println("총합 04 : " + total);

        total = 0;

        //초기식에 i값 첫 설정을 하고 i의 조건을 설정한 후 i가 어떻게 변하는지 증감식으로 설정 (공식은 토탈에서 설정)
        //ex] 1*x + 2*x + 3*x ... ---> 항의 왼쪽의 i가 어떻게 변하는지만 확인 (x값은 토탈에서 설정)


        for (int i = 1; i < 6 ; i = i+1) {
            total = total+i*(i+1);

        } // for 조건식이 참일때 total 이 수행되고 증감식으로 넘어가 다시 참거짓을 판명하고 반복한다
        // i는 구문안에서 소멸한다.

        System.out.println("총합 05 : " + total);
    }
}
