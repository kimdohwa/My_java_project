package ch02_control_statement;

public class Stringswitch {
    public static void main(String[] args) {
        String month = "January" ;
        int monthnumber = 0 ;

        switch (month) {
            case "January" :
                monthnumber = 1;
                break;

            case "February" :
                monthnumber = 2;
                break;

            case "March" :
                monthnumber = 3;
                break;

            default:
                System.exit(0);
        }
        System.out.println(month+"는 "+monthnumber+"월 입니다.");
    }
}
