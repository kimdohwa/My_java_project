
package ch04_class;

public class SaramMain05 {
    public static void main(String[] args) {
//타입[]배열명 = new 타입 [요소의 개수 ]

    Saram05[]saram = new Saram05[2];// 배열생성

        saram[0]= new Saram05("이순신", 160.5, 75.2, "농구", "B");
        saram[1]= new Saram05("최진철", 180.5, 66.3, "O");
// ▲객체생성 / 객체에 클래스이름이 붙어야하지만 8번에서 타입을 지정했기때문 아래는 클래스이름 다음부터 진행

        for (int i = 0; i < saram.length; i++) {
            saram[i].display();
        }
        //배열 바깥에 새로운 배열생성
        Saram05[] mylist = {
                new Saram05("이순신", 160.5, 75.2, "농구", "B")//1번객체생성
                ,new Saram05("최진철", 180.5, 66.3, "O")};//2번 객체생성
// [] 괄호가 붙은것은 배열생성
        for (int i = 0; i < mylist.length; i++) {
            mylist[i].display();
        }
    }
}
