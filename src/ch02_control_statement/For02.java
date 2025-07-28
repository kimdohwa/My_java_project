package ch02_control_statement;

public class For02 {
    public static void main(String[] args) {
        int odd =0;
        int even = 0 ;

        for (int i = 1; i < 11 ; i++) {
            if (i%2==0){
                even +=i ;
            }else {
                odd += i;
            }
        }
        System.out.println(even);
        System.out.println(odd);

        odd =0;
        even=0 ;


        for (int i = 1; i < 11 ; i++) {
            switch (i%2){
                case 0 :
                    even = even + i;
                    break;
                case 1 :
                    odd = odd + i;
                    break;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
