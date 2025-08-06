package 연습.beveragetest;

public abstract class Beverage {
    private String name ;
    private double price ;

    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    protected final String product(){
        return this.name + "제조법\n";
    }

    protected abstract void showInpo();
    protected abstract void drink();
    protected abstract void  make();

    public Beverage(){
    }

    @Override
    public String toString() {
        String message = "이름:"+name;
        message += "\n단가:"+price;
        return message;
    }
}
