package ch02_control_statement;

public class For04 {
    public static void main(String[] args) {
        int sum0 =0 ;
        int sum1 =0 ;
        int sum2 =0 ;

        for (int i = 1; i < 4 ; i++) {
            sum0 = sum0 + (i * 3) ;
        }
        System.out.println(sum0);

        for (int i = 1 ; i < 11 ; i +=1) {
            switch (i%3){
                case 1 :
                    sum1 = sum1 + i ;
            }
        }
        System.out.println(sum1);

        for (int i = 1; i < 10; i++) {
            switch (i%3){
                case 2 :
                    sum2 = sum2 +i ;
            }
        }
        System.out.println(sum2);

        sum0 =0 ;
        sum1 =0 ;
        sum2 =0 ;

        for (int i = 1; i < 10 ; i++) {
            switch (i%3){
                case 0 :
                    sum0 = sum0 + i ;
                    break;
                case 1 :
                    sum1 = sum1 + i ;
                    break;
                case 2 :
                    sum2 = sum2 +i ;
                    break;
            }
        }
        System.out.println(sum0);
        System.out.println(sum1);
        System.out.println(sum2);

        sum0 =0 ;
        sum1 =0 ;
        sum2 =0 ;

        for (int i = 1; i < 10 ; i++) {
            if (i%3 == 0){
                sum0 = sum0+i;
            }else if(i%3 == 1){
                sum1 = sum1+i;
            }else {
                sum2 = sum2+i;
            }
        }
        System.out.println(sum0);
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
