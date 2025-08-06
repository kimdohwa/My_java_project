package 연습.beveragetest;

public class Espresso extends Beverage{
    private int shot;

    public Espresso(String name, double price, int shot) {
        super(name,price);
        this.shot=shot;
    }

    @Override
    protected void showInpo() {
        String msg = "음료 "+ super.getName()+"의 단가는 "+ super.getPrice()+"입니다.\n"+super.getName()+"의 샷 개수는 "+ shot +"입니다.";
        System.out.println(msg);
    }

    @Override
    protected void drink() {
        String msg = "맛이 진하고 강렬한 "+super.getName()+"를 마십니다.";
        System.out.println(msg);
    }

    @Override
    protected void make() {
        String msg = "원두를 미세하게 갈아서, 탬퍼로 평평하게 눌러줍니다.\n포터필터를 머신에 장착하고, 25-30초 동안 30ml의 에스프레소를 추출합니다.";
        System.out.println(super.product()+msg+"\n");
    }
}
