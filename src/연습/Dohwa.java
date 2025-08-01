package 연습;

public class Dohwa {

        Dohwa(String name){

            System.out.println(name);
        }


        String number(String a, String b){

            String phon ;
            if(a == "폰"){
                phon = "1122" ;
                System.out.println(phon);
            } else {
                phon = "3148" ;
                System.out.println(phon);
            }

            b = "넘버";
            System.out.println(b);

            String msg = phon + b ;

            return msg;
        }




}
