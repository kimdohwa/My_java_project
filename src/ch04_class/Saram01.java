package ch04_class;

public class Saram01 {
//공유하고자하는변수는 static키워드를 사용하세요.
    static String nationality ;

    //1> 클래스 정의
    String name ;
    double height ;
    double weight ;
    String hobby ;
    String blood ;

    //반환타입 메소드이름(매개변수타입 매개변수이름){}
    String showGenderInfo(int juminno) {
        String gender = "";
        String message = "";

        if (juminno == 1 || juminno == 3) {
            gender = "남자";
        } else if (juminno == 2 || juminno == 4) {
            gender = "여자";
        }
        message = name+"님은"+gender+"입니다." ;
        return message ;
    }

    String showBmiInfo(){

        double newheight = height/100.0 ;
        double rate = weight/(newheight*newheight) ;
        String bmi="" ;

        if(rate>=25.00){
            bmi ="비만" ;
        }else if(rate>=23.00){
            bmi = "과체중";
        }else if (rate>=18.50){
            bmi = "정상";
        }else {
            bmi = "저체중";
        }
        return bmi ;
        //message = bmi + "입니다." ;
        // return message ;
        //▲ 사용가능
    }
    //반환하지않는경우
void display(){
    System.out.println(name+"님의 신상정보");
    System.out.println("국적"+nationality);
    System.out.println("이름"+name);
    System.out.println("키"+height);
    System.out.println("몸무게"+weight);
    System.out.println("취미"+ hobby);
    }



}

