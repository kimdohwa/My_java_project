package ch02_control_statement;

public class MultiIf02 {
    public static void main(String[] args) {

        // 나이 , 유형 , 가격

        int age = 50 ;
        String 유형 ;
        double 가격 = 1000 ;

        if (age < 8) {
            유형 = "유아(무료입장)";
            가격 = 0 ;
        } else if ( age<14){
            유형 = "어린이(50% 할인)";
            가격 *= 0.5 ;
        } else if ( age<20){
            유형 = "청소년(30% 할인)";
            가격 *= 0.7 ;
        } else if ( age<65){
            유형 = "성인(정가)";
        }else {
            유형 = "노인(40%할인)";
            가격 *= 0.6 ;
        }

        System.out.println(age + "살: " + 유형);
        System.out.println("가격은 " + (int)가격 + "원 입니다.");



    }
}
