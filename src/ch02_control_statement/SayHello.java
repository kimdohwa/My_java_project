package ch02_control_statement;

public class SayHello {
    public static void main(String[] args) {

        String hello = "안녕하세요." ;
        int su = 3 ;

        for (int i = su ; i > 0 ; i -= 1) {
            System.out.println(hello);
        }
    }
}
