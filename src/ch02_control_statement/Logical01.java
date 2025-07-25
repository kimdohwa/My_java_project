package ch02_control_statement;

public class Logical01 {
    public static void main(String[] args) {

        int month =13;
        String season ;

        if (month>=3 && month<=5){
            season = "봄";
        } else if (month>5 && month<=8){
            season= "여름";
        } else if (month>9 && month<=11){
            season="가을";
        } else if (month==12 || month<=2){
            season ="겨울";
        } else {
            season= " ";
        }

        System.out.println(month + "월은 "+ season + "입니다.");


    }
}
