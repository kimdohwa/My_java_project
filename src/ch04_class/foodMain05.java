package ch04_class;

public class foodMain05 {
    public static void main(String[] args) {

        food05[] food = new food05[3]; // 클래스는 타입으로 적용 -> 1. 배열 생성
        //2. 객체생성

        food[0] = new food05("피자", "양식", 15000,4000,"서울");
        food[1] = new food05("와플", "디저트", 5000,3000,"경기");
        food[2] = new food05("짜장면", "중식", 8000,5500,"강원도");


        for (int i = 0; i < food.length; i++) {
            food[i].output();
        }
    }
}
