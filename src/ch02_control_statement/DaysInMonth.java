package ch02_control_statement;

public class DaysInMonth {
    public static void main(String[] args) {
        int month = 13;
        int lastday = 0 ;

        switch (month){
            case 1, 3, 5, 7, 8, 10, 12 :
                lastday = 31 ;

                break;

            case 2 :
                lastday = 28 ;

                break;

            case 4, 6, 9, 11 :
                lastday = 30 ;

                break;

            default:
                System.out.println("1~12 까지를 입력해주세요.");
                System.exit(0);


        }
        System.out.println(month+"월의 마지막 날은 "+ lastday+ "일입니다.");
    }
}
