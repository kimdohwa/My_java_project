package ch04_class;

public class food01 {
    String 이름 ;
    String 종류 ;
    String 맛 ;
    int 가격 ;
    int 배달비 ;


    void 정보(){
        System.out.println("이름: "+ 이름);
        System.out.println("종류: "+ 종류);
        System.out.println("맛: "+ 맛);
        System.out.println("가격: " +가격);
        System.out.println("배달비 :" +배달비);

    }

    String 배달비포함가격(){
        int 배달비포함가격은 = 가격 + 배달비 ;
        String messase ;
        messase= "배달비포함가격은"+ 배달비포함가격은 + "입니다.";
        return messase;
    }

    //가격이 6000원 이상이면 배달가능 이하면 배달불가
    String 배달가능여부(){

        String message;

        if ((가격+배달비)>=10000){
            message ="배달가능";
        }else {
            message ="배달불가";
        }
        return message ;
    }

    String 지역(String 지역이름){
        String message;
        switch(지역이름){
            case "서울" : case "경기" : case "강원" :
                message ="가능지역";
                break;

            default:
                message ="불가능지역";
                break;
        }
        return message;
    }

}


