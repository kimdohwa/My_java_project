package ch05_package_inheritance.general;

public class BaseBall extends Sport {
    private int innings; // 이닝 수
    private double hitrate; // 타율

    public BaseBall(String name, int entry, int innings, double hitrate) {
        super(name, entry);
        this.innings = innings;
        this.hitrate = hitrate;
    }

    public void print(){
        super.print();
        System.out.println(innings+"개의 이닝으로 구성이 되며, 타율 "+hitrate+"를 기록하였습니다!");
    }

}
