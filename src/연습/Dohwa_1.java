package 연습;

public class Dohwa_1 extends Dohwa {

    static int esss = 100;

    public void qwe(){
        esss = 11;
        System.out.println(esss);
    }


    private String fun ;

    public Dohwa_1(String name, String wawo, String fun) {
        super();
        this.fun = fun;
    }

    public void ess_(){
        super.ess();
    }

    @Override
    public void ess2() {
        System.out.println(fun);
    }

    @Override
    public void ess3() {
        System.out.println("gg");
    }
}
