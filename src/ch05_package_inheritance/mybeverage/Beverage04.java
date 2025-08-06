package ch05_package_inheritance.mybeverage;

public class Beverage04 {
    private String name;
    private double price;

    // @으로 시작하는 항목들을 어노테이션이라고 부릅니다.
    @Override// 이 메소드는 오버라이딩 되었씁니다.
    public String toString() {
        String meg ="";
        meg = "품명 : "+ this.name+ "\n단가 : "+this.price ;
        return meg ;
    }

    //메소드 은닉화 : 오버라이딩시 본의 아니게 , 수퍼클래스의 메소드가 숨겨지는 현상을 일컫는 말입니다.


    public  Beverage04(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void ShowInfo(){

        String msg ="\n이름 : "+ name +"\n단가 : "+ price;
       System.out.println(msg);
    }


    public Beverage04(String name, double price){
        this.name= name;
        this.price= price ;
    }


}
