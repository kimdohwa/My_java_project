package ch02_control_statement;

public class ForTest01 {
    public static void main(String[] args) {
        int total = 0;
        int su = 9 ;

        for (int i = 1; i < 10 ; i++) {

            total = su*i ;
            System.out.println(su+ " * "+ i + " = "+ total);
        }

    }
}
