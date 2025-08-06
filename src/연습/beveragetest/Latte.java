package 연습.beveragetest;

public class Latte extends Beverage {
    private String milk;

    public Latte(String name, double price,String milk) {
        super(name,price);
        this.milk = milk;
    }


    @Override
    protected void showInpo() {
        String msg = "음료 " + super.getName() + "의 단가는 " + super.getPrice() + "입니다.\n"+super.getName()+"의 우유 타입은 "+ milk +"입니다.";;
        System.out.println(msg);
    }


    @Override
    protected void drink() {
        String msg = "부드럽고 크리미한 " + super.getName() + "를 마십니다.";
        System.out.println(msg);
    }

    @Override
    protected void make() {
        String msg ="에스프레소 1샷을 추출합니다.\n컵에 에스프레소를 넣고 뜨거운 물을 부어줍니다.\n에스프레소를 먼저 넣고 물을 나중에 부으면 됩니다.";
        System.out.println(super.product()+msg+"\n");
    }
}
