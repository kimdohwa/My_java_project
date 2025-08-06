package 연습.nopolymorphism;

public class Avante extends Car{

    private String co;

    public Avante(int price,String car,String co){
        super(price,car);
        this.co = co;
    }

    @Override
    public void showInpo() {
        super.showInpo();
        String msg ="코멘트: "+co;
        System.out.println(msg);
    }


}
