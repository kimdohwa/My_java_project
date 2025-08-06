package 연습.beveragetest;

public class Americano extends Beverage {
    private double water;

    public Americano(String name, double price, double water) {
        super(name,price);
        this.water = water ;
    }

    @Override
    protected void showInpo() {
        String msg = "음료 "+ super.getName()+"의 단가는 "+ super.getPrice()+"입니다.\n"+super.getName()+"의 물 양은 "+ water +"입니다.";
        System.out.println(msg);
    }



    @Override
    protected void drink() {
        String msg = super.getName()+"를 홀짝홀짝 마십니다.";
        System.out.println(msg);
    }

    @Override
    protected void make() {
        String msg = "에스프레소 1샷을 추출합니다.\n컵에 에스프레소를 넣고 뜨거운 물을 부어줍니다.\n에스프레소를 먼저 넣고 물을 나중에 부으면 됩니다.";
        System.out.println(super.product()+msg+"\n");
    }

    @Override
    public String toString() {
        String message= "\n물의 양: "+ water;
        return super.toString()+message;
    }
}
