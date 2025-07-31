package ch04_class;

public class SaramMain03 {
    public static void main(String[] args) {

        Saram03 yusin = new Saram03();
        Saram03 soon = new Saram03();

        yusin.setName("김유신");
        yusin.setHobby("축구");
        yusin.setHeight(175.2);
        yusin.setWeight(65.2);
        yusin.setBlood("A");


        soon.setName("유관순");
        soon.setHobby("당구");
        soon.setHeight(168.3);
        soon.setWeight(52.5);
        soon.setBlood("B");


        System.out.println("이름 : "+ yusin.getName());
        System.out.println("키 : "+ yusin.getHeight());
        System.out.println("취미 : "+ yusin.getHobby());
        System.out.println("몸무게 : "+ yusin.getWeight());
        System.out.println("혈액형 : "+ yusin.getBlood());

        System.out.println("이름 : "+ soon.getName());
        System.out.println("키 : "+ soon.getHeight());
        System.out.println("취미 : "+ soon.getHobby());
        System.out.println("몸무게 : "+ soon.getWeight());
        System.out.println("혈액형 : "+ soon.getBlood());
    }
}

