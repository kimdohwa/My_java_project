package 연습.nopolymorphism;

public class Sonata extends Car {

    private String maker;

    public Sonata(int price, String car, String maker) {
        super(price, car);
        this.maker = maker;
    }

    @Override
    public void showInpo() {
        super.showInpo();
        String msg ="메이커: "+ maker;
        System.out.println(msg);
    }
}
