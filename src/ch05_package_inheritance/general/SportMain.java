package ch05_package_inheritance.general;

public class SportMain {
    public static void main(String[] args) {
        FootBall footBall = new FootBall("축구",11,1,5);

        BaseBall baseBall = new BaseBall("야구",9,9,0.412);

        footBall.print();
        baseBall.print();
    }

}
