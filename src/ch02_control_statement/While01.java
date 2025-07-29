package ch02_control_statement;

public class While01 {
    public static void main(String[] args) {
        int i = 1;
        int total = 0;

        while (i<11){
            total += i ;
            i++ ;
        }
        System.out.println(total);

        i= 97;
        total= 0;

        while(i>0){
            total = total + i ;
            i -= 5 ;
        }
        System.out.println(total);

        i = 1;
        total = 0 ;

        while (i<97){
            total = total+(i*i);
            i += 5 ;
        }
        System.out.println(total);

        i = 1;
        total =0;

        while (i<6){
            total = total+i*(i+1);
            i += 1 ;
        }
        System.out.println(total);

        i = 1;
        total =0;
        int dan = 3 ;

        while (i<10){

            System.out.println(dan+"*"+i+"="+(dan*i));
            i += 1 ;

        }

        int odd =0; // 홀수
        int even = 0; //짝수
        i = 0;

        while (i<11){
            if (i%2 == 0){
                even = even+i ;
            }else {
                odd = odd+i;
            }
            i++;
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
