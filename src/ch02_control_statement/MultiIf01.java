package ch02_control_statement;

public class MultiIf01 {
    public static void main(String[] args) {
        int temperature = 1;
        String a ;

        if(temperature >= 35){
            a = "폭염경보";
        }else if (temperature>=30){
            a = "무더운 날씨";
        }else if (temperature>=20){
            a = "쾌적한 날씨";
        }else if (temperature>=10){
            a = "쌀쌀한 날씨";
        }else {
            a = "추운 날씨";
        }
        System.out.println(temperature + "도는 "+ a + "입니다.");
    }
}
