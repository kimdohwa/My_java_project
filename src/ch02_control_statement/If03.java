package ch02_control_statement;

public class If03 {
    public static void main(String[] args) {
        int su = 7;

        if(su%3 == 0){
            System.out.println(su + "는(은) 3의 배수 입니다.");
            System.out.println(su*su);
        }else {
            System.out.println(su + "는(은) 3의 배수가 아닙니다.");
            System.out.println(su+5);
        }

        String name = "박영희";
        int age = 25;
        int gender = 4;

        System.out.print("이름 : "+ name+ "님, ");
        System.out.print("나이 : "+ age+ "세, " );

        if(age >= 19){
            System.out.print("성인체크 : 성인, ");
        }else {
            System.out.print("성인체크 : 미성년자, ");
        }

        if(gender == 1 || gender == 3){
            System.out.println("성별 : 남자");
        }else {
            System.out.println("성별 : 여자");
        }

        String adult ;

        if(age >= 19){
            adult="성인";
        }else {
            adult="미성년자";
        }

        String _gender ;

        if(gender == 1 || gender == 3){
            _gender = "남자";
        }else {
            _gender = "여자";
        }

        System.out.println("이름 : "+ name +"님, " + "나이 : "+ age+ "세, "+ "성인체크 : "+ adult + ", 성별 : "+ _gender);

    }
}
